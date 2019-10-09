package business.converter.accountlibrarian;

import dataaccess.dao.accountlibrariandao.AccountLibrarianDaoImpl;

public class AccountLibrarianParamConverterImpl implements AccountLibrarianParamConverter{
    private AccountLibrarianDaoImpl accountLibrarianDao;

    public AccountLibrarianDaoImpl getAccountLibrarianDao() {
        return accountLibrarianDao;
    }

    public void setAccountLibrarianDao(AccountLibrarianDaoImpl accountLibrarianDao) {
        this.accountLibrarianDao = accountLibrarianDao;
    }
}
