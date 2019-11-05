package business.converter.accountlibrarianstatus;

import data.entity.AccountLibrarian;
import data.entity.AccountLibrarianStatus;

public interface AccountLibrarianStatusParamConverter {

    AccountLibrarianStatus convert(AccountLibrarianStatusParam param, AccountLibrarianStatus oldEntity);
}
