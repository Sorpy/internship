package business.processor.accountclientprocessor;

import business.converter.accountclient.AccountClientParam;
import business.converter.accountclient.AccountClientResult;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface AccountClientProcessor {
    AccountClientResult create(AccountClientParam param) throws JsonProcessingException;
    List<AccountClientResult> create(List<AccountClientParam> param) throws JsonProcessingException;

    void update(long id,AccountClientParam param);
    void update(List<AccountClientParam> param);

    void delete(long id);
    void delete(List<Long> idList);

    AccountClientResult find(long id) throws JsonProcessingException;
    List<AccountClientResult> find() throws JsonProcessingException;
    List<AccountClientResult> find(String name);
}
