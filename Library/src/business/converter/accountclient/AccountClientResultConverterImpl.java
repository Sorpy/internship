package business.converter.accountclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.entity.AccountClient;

public class AccountClientResultConverterImpl implements AccountClientResultConverter {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public AccountClientResult convert(AccountClient param){
        AccountClientResult accountClientResult = new AccountClientResult();
        accountClientResult.setFirstName(param.getFirstName());
        accountClientResult.setSecondName(param.getSecondName());
        accountClientResult.setLastName(param.getLastName());
        accountClientResult.setAddress(param.getAddress());
        accountClientResult.setCity(param.getCity());
        accountClientResult.setCountry(param.getCountry());
        accountClientResult.setEmail(param.getEmail());
        accountClientResult.setAccountClientStatus(param.getAccountClientStatus());
        accountClientResult.setPhone(param.getPhone());
        accountClientResult.setID(param.getID());
        accountClientResult.setUser(param.getUser());
        accountClientResult.setName(param.getName());
        accountClientResult.setCode(param.getCode());
        accountClientResult.setDescription(param.getDescription());
        return accountClientResult;
    }
}
