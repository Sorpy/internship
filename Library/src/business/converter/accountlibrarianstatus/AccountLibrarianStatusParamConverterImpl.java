package business.converter.accountlibrarianstatus;

import data.entity.AccountLibrarianStatus;
import dataaccess.dao.accountlibrarianstatusdao.AccountLibrarianStatusDao;
import dataaccess.dao.accountlibrarianstatusdao.AccountLibrarianStatusDaoImpl;

public class AccountLibrarianStatusParamConverterImpl implements AccountLibrarianStatusParamConverter{
    private AccountLibrarianStatusDao accountLibrarianStatusDao;

    public AccountLibrarianStatusDao getAccountLibrarianStatusDao() {
        return accountLibrarianStatusDao;
    }

    public void setAccountLibrarianStatusDao(AccountLibrarianStatusDao accountLibrarianStatusDao) {
        this.accountLibrarianStatusDao = accountLibrarianStatusDao;
    }

    @Override
    public AccountLibrarianStatus convert(AccountLibrarianStatusParam param) {
        return null;
    }
}
