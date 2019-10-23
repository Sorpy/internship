package dataaccess.dao.accountclientdao;

import data.entity.AccountClient;

import java.util.List;

public interface AccountClientDao {
    AccountClient save(AccountClient entity);
    List<AccountClient> save(List<AccountClient> entity);

    AccountClient update(AccountClient entity);
    List<AccountClient> update(List<AccountClient> entity);

    void delete(long id);
    void delete(AccountClient entity);
    void delete(List<Long> idList);

    List<AccountClient> find();
    AccountClient find(long id);
    List<AccountClient> find(String name);

}
