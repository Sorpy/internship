package business.processor.accountlibrarianprocessor;

import business.converter.accountlibrarian.AccountLibrarianParamConverterImpl;
import business.converter.accountlibrarian.AccountLibrarianResultConverterImpl;
import dataaccess.dao.accountlibrariandao.AccountLibrarianDaoImpl;

public class AccountLibrarianProcessorImpl implements AccountLibrarianProcessor{
    private AccountLibrarianDaoImpl accountLibrarianDao;
    private AccountLibrarianParamConverterImpl accountLibrarianParamConverter;
    private AccountLibrarianResultConverterImpl accountLibrarianResultConverter;

    public AccountLibrarianDaoImpl getAccountLibrarianDao() {
        return accountLibrarianDao;
    }

    public void setAccountLibrarianDao(AccountLibrarianDaoImpl accountLibrarianDao) {
        this.accountLibrarianDao = accountLibrarianDao;
    }

    public AccountLibrarianParamConverterImpl getAccountLibrarianParamConverter() {
        return accountLibrarianParamConverter;
    }

    public void setAccountLibrarianParamConverter(AccountLibrarianParamConverterImpl accountLibrarianParamConverter) {
        this.accountLibrarianParamConverter = accountLibrarianParamConverter;
    }

    public AccountLibrarianResultConverterImpl getAccountLibrarianResultConverter() {
        return accountLibrarianResultConverter;
    }

    public void setAccountLibrarianResultConverter(AccountLibrarianResultConverterImpl accountLibrarianResultConverter) {
        this.accountLibrarianResultConverter = accountLibrarianResultConverter;
    }
}
