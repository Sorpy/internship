package data.entity.model.account;

import data.entity.model.status.AccountLibrarianStatus;

public class AccountLibrarian extends Account {
    private AccountLibrarianStatus accountLibrarianStatus;

    public AccountLibrarianStatus getAccountLibrarianStatus() {
        return accountLibrarianStatus;
    }

    public void setAccountLibrarianStatus(AccountLibrarianStatus accountLibrarianStatus) {
        this.accountLibrarianStatus = accountLibrarianStatus;
    }
}
