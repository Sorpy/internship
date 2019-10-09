package presentation.service.accountlibrarianservice;

import business.processor.accountlibrarianprocessor.AccountLibrarianProcessorImpl;

public class AccountLibrarianServiceImpl implements AccountLibrarianService {
    private AccountLibrarianProcessorImpl accountLibrarianProcessor;

    public AccountLibrarianProcessorImpl getAccountLibrarianProcessor() {
        return accountLibrarianProcessor;
    }

    public void setAccountLibrarianProcessor(AccountLibrarianProcessorImpl accountLibrarianProcessor) {
        this.accountLibrarianProcessor = accountLibrarianProcessor;
    }
}
