package business.converter.accountclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import data.entity.AccountClient;

public interface AccountClientResultConverter {
    AccountClientResult convert(AccountClient param);
}
