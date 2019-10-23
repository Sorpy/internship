package business.converter.accountlibrarian;

import data.entity.AccountLibrarian;
import dataaccess.dao.accountlibrariandao.AccountLibrarianDao;
import dataaccess.dao.accountlibrariandao.AccountLibrarianDaoImpl;

public class AccountLibrarianParamConverterImpl implements AccountLibrarianParamConverter{
    private AccountLibrarianDao accountLibrarianDao;

    public AccountLibrarianDao getAccountLibrarianDao() {
        return accountLibrarianDao;
    }

    public void setAccountLibrarianDao(AccountLibrarianDao accountLibrarianDao) {
        this.accountLibrarianDao = accountLibrarianDao;
    }

    @Override
    public AccountLibrarian convert(AccountLibrarianParam param) {
        return null;
    }
}
