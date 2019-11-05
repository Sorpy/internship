package business.converter.accountclient;

import data.entity.AccountClient;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.*;
import org.apache.commons.lang3.reflect.FieldUtils;

import static org.apache.commons.lang3.reflect.FieldUtils.*;

public class AccountClientResultConverterImpl implements AccountClientResultConverter {


    @Override
    public AccountClientResult convert(AccountClient param) throws IllegalAccessException {
        AccountClientResult accountClientResult = new AccountClientResult();
        /*
        accountClientResult.setFirstName(param.getFirstName());
        accountClientResult.setSecondName(param.getSecondName());
        accountClientResult.setLastName(param.getLastName());
        accountClientResult.setAddress(param.getAddress());
        accountClientResult.setCity(param.getCity());
        accountClientResult.setCountry(param.getCountry());
        accountClientResult.setEmail(param.getEmail());
        accountClientResult.setAccountClientStatusId(param.getAccountClientStatus().getID());
        accountClientResult.setAccountClientStatusName(param.getAccountClientStatus().getName());
        accountClientResult.setPhone(param.getPhone());
        accountClientResult.setID(param.getID());
        accountClientResult.setUserId(param.getUser().getID());
        accountClientResult.setUsername(param.getUser().getUsername());
        accountClientResult.setName(param.getName());
        accountClientResult.setCode(param.getCode());
        accountClientResult.setDescription(param.getDescription());
        */


        List<Field> entityFields = getAllFieldsList(param.getClass());
        List<Field> resultFields = getAllFieldsList(accountClientResult.getClass());
        Map<String,Field> entityHashMap = new HashMap<>();
        Map<String,Field> resultHashMap = new HashMap<>();



        for (Field field :entityFields) {
            entityHashMap.put(field.getName(),field);
        }
        for (Field field: resultFields){
            resultHashMap.put(field.getName(),field);
        }



        entityHashMap.forEach((key, value) -> {
            try {
                writeField(accountClientResult,key,
                        readDeclaredField(param,key,true),true);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        accountClientResult.setAccountClientStatusId(param.getAccountClientStatus().getID());
        accountClientResult.setAccountClientStatusName(param.getAccountClientStatus().getName());
        accountClientResult.setUserId(param.getUser().getID());
        accountClientResult.setUsername(param.getUser().getUsername());




        return accountClientResult;
    }
}
