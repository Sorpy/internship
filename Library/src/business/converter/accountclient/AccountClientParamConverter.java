package business.converter.accountclient;

import data.entity.AccountClient;

public interface AccountClientParamConverter {

    AccountClient convert(AccountClientParam param, AccountClient oldEntity);
}
