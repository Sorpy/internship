package dataaccess.dao.accountclientstatusdao;

import data.entity.AccountClientStatus;

import java.util.List;

import static dataaccess.dao.accountclientstatusdao.AccountClientStatusData.*;

public class AccountClientStatusDaoImpl implements AccountClientStatusDao {
    @Override
    public AccountClientStatus save(AccountClientStatus entity) {
        accountClients.add(entity);
        return entity;
    }

    @Override
    public List<AccountClientStatus> save(List<AccountClientStatus> entity) {
        accountClients.addAll(entity);
        return entity;
    }

    @Override
    public AccountClientStatus update(AccountClientStatus entity) {
        return null;
    }

    @Override
    public List<AccountClientStatus> update(List<AccountClientStatus> entity) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(AccountClientStatus entity) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public List<AccountClientStatus> find() {
        return null;
    }

    @Override
    public AccountClientStatus find(long id) {
        return null;
    }
}
