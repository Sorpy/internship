package business.converter.accountclient;

import data.entity.AccountClient;

public interface AccountClientResultConverter {
    AccountClientResult convert(AccountClient param) throws IllegalAccessException;
}
