package business.converter.accountlibrarianstatus;

import data.entity.AccountLibrarianStatus;

public class AccountLibrarianStatusParamConverterImpl implements AccountLibrarianStatusParamConverter{

    @Override
    public AccountLibrarianStatus convert(AccountLibrarianStatusParam param, AccountLibrarianStatus oldEntity){
        AccountLibrarianStatus entity = null;
        if(oldEntity!=null){
            entity = oldEntity;
        } else {
            entity = new AccountLibrarianStatus();
            entity.setId(param.getId());
            entity.setCode(param.getCode());
        }
        entity.setName(param.getName());
        entity.setDescription(param.getDescription());
        return entity;
    }
}
