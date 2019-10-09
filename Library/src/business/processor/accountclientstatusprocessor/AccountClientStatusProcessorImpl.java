package business.processor.accountclientstatusprocessor;

import business.converter.accountclientstatus.AccountClientStatusParamConverterImpl;
import business.converter.accountclientstatus.AccountClientStatusResultConverterImpl;
import dataaccess.dao.accountclientstatusdao.AccountClientStatusDaoImpl;

public class AccountClientStatusProcessorImpl implements AccountClientStatusProcessor{
    private AccountClientStatusDaoImpl accountClientStatusDao;
    private AccountClientStatusParamConverterImpl accountClientStatusParamConverter;
    private AccountClientStatusResultConverterImpl accountClientStatusResultConverter;

    public AccountClientStatusDaoImpl getAccountClientStatusDao() {
        return accountClientStatusDao;
    }

    public void setAccountClientStatusDao(AccountClientStatusDaoImpl accountClientStatusDao) {
        this.accountClientStatusDao = accountClientStatusDao;
    }

    public AccountClientStatusParamConverterImpl getAccountClientStatusParamConverter() {
        return accountClientStatusParamConverter;
    }

    public void setAccountClientStatusParamConverter(AccountClientStatusParamConverterImpl accountClientStatusParamConverter) {
        this.accountClientStatusParamConverter = accountClientStatusParamConverter;
    }

    public AccountClientStatusResultConverterImpl getAccountClientStatusResultConverter() {
        return accountClientStatusResultConverter;
    }

    public void setAccountClientStatusResultConverter(AccountClientStatusResultConverterImpl accountClientStatusResultConverter) {
        this.accountClientStatusResultConverter = accountClientStatusResultConverter;
    }
}
