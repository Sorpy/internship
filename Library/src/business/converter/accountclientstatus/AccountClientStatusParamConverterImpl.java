package business.converter.accountclientstatus;

import data.entity.AccountClientStatus;
import dataaccess.dao.accountclientstatusdao.AccountClientStatusDao;
import dataaccess.dao.accountclientstatusdao.AccountClientStatusDaoImpl;

public class AccountClientStatusParamConverterImpl implements AccountClientStatusParamConverter {
    private AccountClientStatusDao accountClientStatusDao;

    public AccountClientStatusDao getAccountClientStatusDao() {
        return accountClientStatusDao;
    }

    public void setAccountClientStatusDao(AccountClientStatusDao accountClientStatusDao) {
        this.accountClientStatusDao = accountClientStatusDao;
    }

    @Override
    public AccountClientStatus convert(AccountClientStatusParam param) {
        AccountClientStatus accountClientStatus = new AccountClientStatus();
        accountClientStatus.setID(param.getID());
        accountClientStatus.setName(param.getName());
        accountClientStatus.setDescription(param.getDescription());
        accountClientStatus.setCode(param.getCode());
        accountClientStatus.setStatus(param.getStatus());
        return accountClientStatus;
    }
}
