package presentation.service.accountclientstatusservive;

import business.processor.accountclientstatusprocessor.AccountClientStatusProcessorImpl;

public class AccountClientStatusServiceImpl implements AccountClientStatusService {
    private AccountClientStatusProcessorImpl accountClientStatusProcessor;

    public AccountClientStatusProcessorImpl getAccountClientStatusProcessor() {
        return accountClientStatusProcessor;
    }

    public void setAccountClientStatusProcessor(AccountClientStatusProcessorImpl accountClientStatusProcessor) {
        this.accountClientStatusProcessor = accountClientStatusProcessor;
    }
}
