package business.converter.accountclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import data.entity.AccountClient;

public interface AccountClientParamConverter {

    AccountClient convert(AccountClientParam param) ;
    AccountClient convert(AccountClientParam param, AccountClient oldEntity);
}
