package business.converter.accountclientstatus;

import data.entity.AccountClientStatus;

public class AccountClientStatusResultConverterImpl implements AccountClientStatusResultConverter {
    @Override
    public AccountClientStatusResult convert(AccountClientStatus param) {
        AccountClientStatusResult accountClientStatusResult = new AccountClientStatusResult();
        accountClientStatusResult.setStatus(param.getStatus());
        accountClientStatusResult.setCode(param.getCode());
        accountClientStatusResult.setDescription(param.getDescription());
        accountClientStatusResult.setID(param.getID());
        accountClientStatusResult.setName(param.getName());
        return accountClientStatusResult;
    }
}
