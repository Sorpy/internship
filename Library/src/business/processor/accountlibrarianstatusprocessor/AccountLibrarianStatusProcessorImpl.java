package business.processor.accountlibrarianstatusprocessor;

import business.converter.accountlibrarianstatus.AccountLibrarianStatusParamConverterImpl;
import business.converter.accountlibrarianstatus.AccountLibrarianStatusResultConverterImpl;
import dataaccess.dao.accountlibrarianstatusdao.AccountLibrarianStatusDaoImpl;

public class AccountLibrarianStatusProcessorImpl implements AccountLibrarianStatusProcessor{
    private AccountLibrarianStatusDaoImpl accountLibrarianStatusDao;
    private AccountLibrarianStatusParamConverterImpl accountLibrarianStatusParamConverter;
    private AccountLibrarianStatusResultConverterImpl accountLibrarianStatusResultConverter;

    public AccountLibrarianStatusDaoImpl getAccountLibrarianStatusDao() {
        return accountLibrarianStatusDao;
    }

    public void setAccountLibrarianStatusDao(AccountLibrarianStatusDaoImpl accountLibrarianStatusDao) {
        this.accountLibrarianStatusDao = accountLibrarianStatusDao;
    }

    public AccountLibrarianStatusParamConverterImpl getAccountLibrarianStatusParamConverter() {
        return accountLibrarianStatusParamConverter;
    }

    public void setAccountLibrarianStatusParamConverter(AccountLibrarianStatusParamConverterImpl accountLibrarianStatusParamConverter) {
        this.accountLibrarianStatusParamConverter = accountLibrarianStatusParamConverter;
    }

    public AccountLibrarianStatusResultConverterImpl getAccountLibrarianStatusResultConverter() {
        return accountLibrarianStatusResultConverter;
    }

    public void setAccountLibrarianStatusResultConverter(AccountLibrarianStatusResultConverterImpl accountLibrarianStatusResultConverter) {
        this.accountLibrarianStatusResultConverter = accountLibrarianStatusResultConverter;
    }
}
