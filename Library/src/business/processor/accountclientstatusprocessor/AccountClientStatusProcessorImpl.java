package business.processor.accountclientstatusprocessor;

import business.converter.accountclientstatus.*;
import data.entity.AccountClientStatus;
import dataaccess.dao.accountclientstatusdao.AccountClientStatusDao;
import dataaccess.dao.accountclientstatusdao.AccountClientStatusDaoImpl;

import java.util.ArrayList;
import java.util.List;

public class AccountClientStatusProcessorImpl implements AccountClientStatusProcessor{
    private AccountClientStatusDao accountClientStatusDao = new AccountClientStatusDaoImpl();
    private AccountClientStatusParamConverter accountClientStatusParamConverter = new AccountClientStatusParamConverterImpl();
    private AccountClientStatusResultConverter accountClientStatusResultConverter = new AccountClientStatusResultConverterImpl();

    public AccountClientStatusDao getAccountClientStatusDao() {
        return accountClientStatusDao;
    }

    public void setAccountClientStatusDao(AccountClientStatusDao accountClientStatusDao) {
        this.accountClientStatusDao = accountClientStatusDao;
    }

    public AccountClientStatusParamConverter getAccountClientStatusParamConverter() {
        return accountClientStatusParamConverter;
    }

    public void setAccountClientStatusParamConverter(AccountClientStatusParamConverter accountClientStatusParamConverter) {
        this.accountClientStatusParamConverter = accountClientStatusParamConverter;
    }

    public AccountClientStatusResultConverter getAccountClientStatusResultConverter() {
        return accountClientStatusResultConverter;
    }

    public void setAccountClientStatusResultConverter(AccountClientStatusResultConverter accountClientStatusResultConverter) {
        this.accountClientStatusResultConverter = accountClientStatusResultConverter;
    }

    @Override
    public AccountClientStatusResult create(AccountClientStatusParam param) {
        return accountClientStatusResultConverter.convert(accountClientStatusDao.save(accountClientStatusParamConverter.convert(param)));
    }

    @Override
    public List<AccountClientStatusResult> create(List<AccountClientStatusParam> param) {
        List<AccountClientStatus> accountClients = new ArrayList<>();
        List<AccountClientStatusResult> accountClientsResult = new ArrayList<>();

        param.forEach(account -> accountClients.add(accountClientStatusParamConverter.convert(account)));
        accountClientStatusDao.save(accountClients);
        accountClients.forEach(clients -> accountClientsResult.add(accountClientStatusResultConverter.convert(clients)));

        return accountClientsResult;
    }

    @Override
    public void update(long id, AccountClientStatusParam param) {

    }

    @Override
    public void update(List<AccountClientStatusParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public AccountClientStatusResult find(long id) {
        return null;
    }

    @Override
    public List<AccountClientStatusResult> find() {
        return null;
    }
}
