package business.converter.accountclient;

import data.entity.AccountClient;
import dataaccess.dao.accountclientstatusdao.AccountClientStatusDao;
import dataaccess.dao.accountclientstatusdao.AccountClientStatusDaoImpl;
import dataaccess.dao.userdao.UserDao;
import dataaccess.dao.userdao.UserDaoImpl;

public class AccountClientParamConverterImpl implements AccountClientParamConverter{
    private UserDao userDao = new UserDaoImpl();
    private AccountClientStatusDao accountClientStatusDao = new AccountClientStatusDaoImpl();



    @Override
    public AccountClient convert(AccountClientParam param, AccountClient oldEntity){
        AccountClient entity = null;
        if(oldEntity!=null)
        {
            entity = oldEntity;
        }
        else
            {
            entity = new AccountClient();
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
        entity.setAccountClientStatus(accountClientStatusDao.find(param.getAccountClientStatusId()));
        entity.setPhone(param.getPhone());
        entity.setUser(userDao.find(param.getUserId()));
        entity.setName(param.getName());
        entity.setDescription(param.getDescription());
        return entity;
    }

}
