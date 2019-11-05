package business.converter.accountlibrarianstatus;

import data.entity.AccountLibrarian;
import data.entity.AccountLibrarianStatus;
import dataaccess.dao.accountlibrarianstatusdao.AccountLibrarianStatusDao;
import dataaccess.dao.accountlibrarianstatusdao.AccountLibrarianStatusDaoImpl;

public class AccountLibrarianStatusParamConverterImpl implements AccountLibrarianStatusParamConverter{

    @Override
    public AccountLibrarianStatus convert(AccountLibrarianStatusParam param, AccountLibrarianStatus oldEntity){
        AccountLibrarianStatus entity = null;
        if(oldEntity!=null){
            entity = oldEntity;
        } else {
            entity = new AccountLibrarianStatus();
            entity.setID(param.getID());
            entity.setCode(param.getCode());
        }
        entity.setName(param.getName());
        entity.setDescription(param.getDescription());
        return entity;
    }
}
