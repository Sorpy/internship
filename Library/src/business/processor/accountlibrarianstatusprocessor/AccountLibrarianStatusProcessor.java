package business.processor.accountlibrarianstatusprocessor;

import business.converter.accountlibrarianstatus.AccountLibrarianStatusParam;
import business.converter.accountlibrarianstatus.AccountLibrarianStatusResult;

import java.util.List;

public interface AccountLibrarianStatusProcessor {
    AccountLibrarianStatusResult create(AccountLibrarianStatusParam param);
    List<AccountLibrarianStatusResult> create(List<AccountLibrarianStatusParam> param);

    void update(long id,AccountLibrarianStatusParam param);
    void update(List<AccountLibrarianStatusParam> param);

    void delete(long id);
    void delete(List<Long> idList);

    AccountLibrarianStatusResult find(long id);
    List<AccountLibrarianStatusResult> find();
}
