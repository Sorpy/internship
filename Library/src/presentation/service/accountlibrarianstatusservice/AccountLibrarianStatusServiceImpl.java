package presentation.service.accountlibrarianstatusservice;

import business.processor.accountlibrarianstatusprocessor.AccountLibrarianStatusProcessorImpl;

public class AccountLibrarianStatusServiceImpl implements AccountLibrarianStatusService{
    private AccountLibrarianStatusProcessorImpl accountLibrarianStatusProcessor;

    public AccountLibrarianStatusProcessorImpl getAccountLibrarianStatusProcessor() {
        return accountLibrarianStatusProcessor;
    }

    public void setAccountLibrarianStatusProcessor(AccountLibrarianStatusProcessorImpl accountLibrarianStatusProcessor) {
        this.accountLibrarianStatusProcessor = accountLibrarianStatusProcessor;
    }
}
