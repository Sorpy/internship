package presentation.service.accountlibrarianservice;

import business.converter.accountlibrarian.AccountLibrarianParam;
import data.common.APIResponse;

import java.util.List;

public interface AccountLibrarianService {
    APIResponse findByPK(long id);
    APIResponse listAll();

    APIResponse create(AccountLibrarianParam param);
    APIResponse create(List<AccountLibrarianParam> param);

    APIResponse update(long id, AccountLibrarianParam param);
    APIResponse update(List<AccountLibrarianParam> param);

    APIResponse deleteById(long id);
    APIResponse delete(List<Long> idList);

    void validateParameters(AccountLibrarianParam param);
    void validateParameters(List<AccountLibrarianParam> param);
}
