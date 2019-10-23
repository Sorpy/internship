package dataaccess.dao.accountclientstatusdao;

import data.entity.AccountClientStatus;

import java.util.List;

public interface AccountClientStatusDao {
    AccountClientStatus save(AccountClientStatus entity);
    List<AccountClientStatus> save(List<AccountClientStatus> entity);

    AccountClientStatus update(AccountClientStatus entity);
    List<AccountClientStatus> update(List<AccountClientStatus> entity);

    void delete(long id);
    void delete(AccountClientStatus entity);
    void delete(List<Long> idList);

    List<AccountClientStatus> find();
    AccountClientStatus find(long id);

}
