package business.converter.accountclientstatus;

import data.entity.AccountClientStatus;

public class AccountClientStatusParamConverterImpl implements AccountClientStatusParamConverter {


    @Override
    public AccountClientStatus convert(AccountClientStatusParam param, AccountClientStatus oldEntity){
        AccountClientStatus entity = null;
        if(oldEntity!=null){
            entity = oldEntity;
        } else {
            entity = new AccountClientStatus();
            entity.setId(param.getId());
            entity.setCode(param.getCode());
        }
        entity.setName(param.getName());
        entity.setDescription(param.getDescription());
        return entity;
    }
}
