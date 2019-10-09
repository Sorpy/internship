package business.converter.accountlibrarianstatus;

import dataaccess.dao.accountlibrarianstatusdao.AccountLibrarianStatusDaoImpl;

public class AccountLibrarianStatusParamConverterImpl implements AccountLibrarianStatusParamConverter{
    private AccountLibrarianStatusDaoImpl accountLibrarianStatusDao;

    public AccountLibrarianStatusDaoImpl getAccountLibrarianStatusDao() {
        return accountLibrarianStatusDao;
    }

    public void setAccountLibrarianStatusDao(AccountLibrarianStatusDaoImpl accountLibrarianStatusDao) {
        this.accountLibrarianStatusDao = accountLibrarianStatusDao;
    }
}
