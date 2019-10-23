package dataaccess.dao.accountclientdao;

import data.entity.AccountClient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static dataaccess.dao.accountclientdao.AccountData.accountClients;

public class AccountClientDaoImpl implements AccountClientDao {
    @Override
    public AccountClient save(AccountClient entity) {
        accountClients.add(entity);
        return entity;
    }

    @Override
    public List<AccountClient> save(List<AccountClient> entity) {
        accountClients.addAll(entity);
        return accountClients;
    }

    @Override
    public AccountClient update(AccountClient entity) {
        accountClients.add(entity);
        return entity;
    }

    @Override
    public List<AccountClient> update(List<AccountClient> entity) {
        return null;
    }

    @Override
    public void delete(long id) {
        AccountClient removeEntity = find(id);
        delete(removeEntity);
    }

    @Override
    public void delete(AccountClient entity) {
        accountClients.remove(entity);
    }

    @Override
    public void delete(List<Long> idList) {
        idList.forEach(this::delete);
    }

    @Override
    public List<AccountClient> find() {
        return accountClients;
    }

    public List<AccountClient> find(String name) {
        return accountClients
                .stream()
                .filter(e -> e.getFirstName().toLowerCase().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public AccountClient find(long id) {
        return accountClients
                .stream()
                .filter(e -> e.getID() == id)
                .findFirst().get();
    }
}
