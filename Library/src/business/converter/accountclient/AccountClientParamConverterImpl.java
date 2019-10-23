package business.converter.accountclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.entity.AccountClient;
import dataaccess.dao.accountclientdao.AccountClientDao;
import dataaccess.dao.accountclientdao.AccountClientDaoImpl;

public class AccountClientParamConverterImpl implements AccountClientParamConverter{
    private AccountClientDao accountClientDao;

    public AccountClientDao getAccountClientDao() {
        return accountClientDao;
    }

    public void setAccountClientDao(AccountClientDao accountClientDao) {
        this.accountClientDao = accountClientDao;
    }


    @Override
    public AccountClient convert(AccountClientParam param){
        AccountClient accountClient = new AccountClient();
        accountClient.setFirstName(param.getFirstName());
        accountClient.setSecondName(param.getSecondName());
        accountClient.setLastName(param.getLastName());
        accountClient.setAddress(param.getAddress());
        accountClient.setCity(param.getCity());
        accountClient.setCountry(param.getCountry());
        accountClient.setEmail(param.getEmail());
        accountClient.setAccountClientStatus(param.getAccountClientStatus());
        accountClient.setPhone(param.getPhone());
        accountClient.setID(param.getID());
        accountClient.setUser(param.getUser());
        accountClient.setName(param.getName());
        accountClient.setCode(param.getCode());
        accountClient.setDescription(param.getDescription());
        return accountClient ;
    }

    @Override
    public AccountClient convert(AccountClientParam param, AccountClient oldEntity){
        AccountClient entity = null;
        if(oldEntity!=null){
            entity = oldEntity;
        } else {
            entity = new AccountClient();
        }
        entity.setFirstName(param.getFirstName());
        entity.setSecondName(param.getSecondName());
        entity.setLastName(param.getLastName());
        entity.setAddress(param.getAddress());
        entity.setCity(param.getCity());
        entity.setCountry(param.getCountry());
        entity.setEmail(param.getEmail());
        entity.setAccountClientStatus(param.getAccountClientStatus());
        entity.setPhone(param.getPhone());
        entity.setUser(param.getUser());
        entity.setName(param.getName());
        entity.setDescription(param.getDescription());
        return entity;
    }

}
