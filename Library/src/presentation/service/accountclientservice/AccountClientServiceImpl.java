package presentation.service.accountclientservice;

import business.processor.accountclientprocessor.AccountClientProcessorImpl;

public class AccountClientServiceImpl implements AccountClientService {
    private AccountClientProcessorImpl accountClientProcessor;

    public AccountClientProcessorImpl getAccountClientProcessor() {
        return accountClientProcessor;
    }

    public void setAccountClientProcessor(AccountClientProcessorImpl accountClientProcessor) {
        this.accountClientProcessor = accountClientProcessor;
    }
}
