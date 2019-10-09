package business.processor.accountclientprocessor;

import business.converter.accountclient.AccountClientParamConverterImpl;
import business.converter.accountclient.AccountClientResultConverterImpl;
import dataaccess.dao.accountclientdao.AccountClientDaoImpl;

public class AccountClientProcessorImpl implements AccountClientProcessor{
    private AccountClientDaoImpl accountClientDao;
    private AccountClientParamConverterImpl accountClientParamConverter;
    private AccountClientResultConverterImpl accountClientResultConverter;

    public AccountClientDaoImpl getAccountClientDao() {
        return accountClientDao;
    }

    public void setAccountClientDao(AccountClientDaoImpl accountClientDao) {
        this.accountClientDao = accountClientDao;
    }

    public AccountClientParamConverterImpl getAccountClientParamConverter() {
        return accountClientParamConverter;
    }

    public void setAccountClientParamConverter(AccountClientParamConverterImpl accountClientParamConverter) {
        this.accountClientParamConverter = accountClientParamConverter;
    }

    public AccountClientResultConverterImpl getAccountClientResultConverter() {
        return accountClientResultConverter;
    }

    public void setAccountClientResultConverter(AccountClientResultConverterImpl accountClientResultConverter) {
        this.accountClientResultConverter = accountClientResultConverter;
    }
}
