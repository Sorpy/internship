package business.converter.accountclient;

import dataaccess.dao.accountclientdao.AccountClientDaoImpl;

public class AccountClientParamConverterImpl implements AccountClientParamConverter{
    private AccountClientDaoImpl accountClientDao;

    public AccountClientDaoImpl getAccountClientDao() {
        return accountClientDao;
    }

    public void setAccountClientDao(AccountClientDaoImpl accountClientDao) {
        this.accountClientDao = accountClientDao;
    }
}
