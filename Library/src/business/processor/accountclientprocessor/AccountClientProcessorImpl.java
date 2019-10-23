package business.processor.accountclientprocessor;

import business.converter.accountclient.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import data.entity.AccountClient;
import dataaccess.dao.accountclientdao.AccountClientDao;
import dataaccess.dao.accountclientdao.AccountClientDaoImpl;

import java.util.ArrayList;
import java.util.List;


public class AccountClientProcessorImpl implements AccountClientProcessor{
    private AccountClientDao accountClientDao = new AccountClientDaoImpl();
    private AccountClientParamConverter accountClientParamConverter = new AccountClientParamConverterImpl();
    private AccountClientResultConverter accountClientResultConverter = new AccountClientResultConverterImpl();

    public AccountClientDao getAccountClientDao() {
        return accountClientDao;
    }

    public void setAccountClientDao(AccountClientDao accountClientDao) {
        this.accountClientDao = accountClientDao;
    }

    public AccountClientParamConverter getAccountClientParamConverter() {
        return accountClientParamConverter;
    }

    public void setAccountClientParamConverter(AccountClientParamConverter accountClientParamConverter) {
        this.accountClientParamConverter = accountClientParamConverter;
    }

    public AccountClientResultConverter getAccountClientResultConverter() {
        return accountClientResultConverter;
    }

    public void setAccountClientResultConverter(AccountClientResultConverter accountClientResultConverter) {
        this.accountClientResultConverter = accountClientResultConverter;
    }

    @Override
    public AccountClientResult create(AccountClientParam param){
        return accountClientResultConverter.convert(accountClientDao.save(accountClientParamConverter.convert(param)));
    }

    @Override
    public List<AccountClientResult> create(List<AccountClientParam> param) throws JsonProcessingException {
        List<AccountClient> accountClients = new ArrayList<>();
        List<AccountClientResult> accountClientsResult = new ArrayList<>();

        param.forEach(account -> accountClients.add(accountClientParamConverter.convert(account)));
        accountClientDao.save(accountClients);
        accountClients.forEach(clients -> accountClientsResult.add(accountClientResultConverter.convert(clients)));

        return accountClientsResult;
    }

    @Override
    public void update(long id, AccountClientParam param) {
        AccountClient oldEntity = accountClientDao.find(id);
        if (oldEntity!=null){
            accountClientDao.delete(id);
            accountClientDao.update(accountClientParamConverter.convert(param,oldEntity));
        }else System.out.println("No entity with id " + id + " found");
    }

    @Override
    public void update(List<AccountClientParam> param) {

    }

    @Override
    public void delete(long id) {
        accountClientDao.delete(id);
    }

    @Override
    public void delete(List<Long> idList) {
        accountClientDao.delete(idList);
    }

    @Override
    public AccountClientResult find(long id) {
        return accountClientResultConverter.convert(accountClientDao.find(id));
    }

    @Override
    public List<AccountClientResult> find(){
        List<AccountClientResult> accountClientsResult = new ArrayList<>();
        accountClientDao.find().forEach(accountClient -> accountClientsResult.add(accountClientResultConverter.convert(accountClient)));
        return accountClientsResult;
    }

    public List<AccountClientResult> find(String firstName){
        List<AccountClientResult> accountClientResult = new ArrayList<>();
        accountClientDao.find(firstName.toLowerCase()).forEach(accountClient -> accountClientResult.add(accountClientResultConverter.convert(accountClient)));
        return accountClientResult;
    }
}
