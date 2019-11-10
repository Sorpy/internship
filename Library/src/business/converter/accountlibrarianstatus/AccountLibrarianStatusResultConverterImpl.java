package business.converter.accountlibrarianstatus;

import data.entity.AccountLibrarianStatus;

public class AccountLibrarianStatusResultConverterImpl implements AccountLibrarianStatusResultConverter {
    @Override
    public AccountLibrarianStatusResult convert(AccountLibrarianStatus param) {
        AccountLibrarianStatusResult accountClientStatusResult = new AccountLibrarianStatusResult();
        accountClientStatusResult.setCode(param.getCode());
        accountClientStatusResult.setDescription(param.getDescription());
        accountClientStatusResult.setId(param.getId());
        accountClientStatusResult.setName(param.getName());
        return accountClientStatusResult;
    }
}
