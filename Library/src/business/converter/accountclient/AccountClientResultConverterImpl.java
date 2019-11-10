package business.converter.accountclient;

import business.converter.common.BaseResultConverter;
import business.converter.common.BaseResultConverterImpl;
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

public class AccountClientResultConverterImpl extends BaseResultConverterImpl<AccountClient,AccountClientResult> implements AccountClientResultConverter {


    @Override
    public AccountClientResult convert(AccountClient param) throws IllegalAccessException {
        AccountClientResult accountClientResult = new AccountClientResult();
        accountClientResult =convertStandart(param,accountClientResult);
        accountClientResult = convertSpecific(param,accountClientResult);
        return accountClientResult;
    }

    @Override
    public AccountClientResult convertSpecific(AccountClient entity, AccountClientResult result) {
        result.setUsername(entity.getUser().getUsername());
        result.setUserId(entity.getUser().getId());
        result.setAccountClientStatusName(entity.getAccountClientStatus().getName());
        result.setAccountClientStatusId(entity.getAccountClientStatus().getId());
        return result;
    }
}
