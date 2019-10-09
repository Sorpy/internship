package business.converter.accountclientstatus;

import dataaccess.dao.accountclientstatusdao.AccountClientStatusDaoImpl;

public class AccountClientStatusParamConverterImpl implements AccountClientStatusParamConverter {
    private AccountClientStatusDaoImpl accountClientStatusDao;

    public AccountClientStatusDaoImpl getAccountClientStatusDao() {
        return accountClientStatusDao;
    }

    public void setAccountClientStatusDao(AccountClientStatusDaoImpl accountClientStatusDao) {
        this.accountClientStatusDao = accountClientStatusDao;
    }
}
