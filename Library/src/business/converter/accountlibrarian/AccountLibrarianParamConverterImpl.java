package business.converter.accountlibrarian;

import data.entity.AccountLibrarian;
import dataaccess.dao.accountclientstatusdao.AccountClientStatusDao;
import dataaccess.dao.accountclientstatusdao.AccountClientStatusDaoImpl;
import dataaccess.dao.accountlibrariandao.AccountLibrarianDao;
import dataaccess.dao.accountlibrariandao.AccountLibrarianDaoImpl;
import dataaccess.dao.accountlibrarianstatusdao.AccountLibrarianStatusDao;
import dataaccess.dao.accountlibrarianstatusdao.AccountLibrarianStatusDaoImpl;
import dataaccess.dao.userdao.UserDao;
import dataaccess.dao.userdao.UserDaoImpl;

public class AccountLibrarianParamConverterImpl implements AccountLibrarianParamConverter{
    private UserDao userDao = new UserDaoImpl();
    private AccountLibrarianStatusDao accountLibrarianStatusDao = new AccountLibrarianStatusDaoImpl();


    @Override
    public AccountLibrarian convert(AccountLibrarianParam param, AccountLibrarian oldEntity){
        AccountLibrarian entity = null;
        if(oldEntity!=null){
            entity = oldEntity;
        } else {
            entity = new AccountLibrarian();
            entity.setID(param.getID());
            entity.setCode(param.getCode());
        }
        entity.setFirstName(param.getFirstName());
        entity.setSecondName(param.getSecondName());
        entity.setLastName(param.getLastName());
        entity.setAddress(param.getAddress());
        entity.setCity(param.getCity());
        entity.setCountry(param.getCountry());
        entity.setEmail(param.getEmail());
        entity.setUser(userDao.find(param.getUserId()));
        entity.setAccountLibrarianStatus(accountLibrarianStatusDao.find(param.getAccountLibrarianStatusId()));
        entity.setPhone(param.getPhone());
        entity.setName(param.getName());
        entity.setDescription(param.getDescription());
        return entity;
    }

}
