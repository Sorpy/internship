package presentation.service.accountlibrarianstatusservice;

import business.converter.accountlibrarianstatus.AccountLibrarianStatusParam;
import business.processor.accountlibrarianstatusprocessor.AccountLibrarianStatusProcessor;
import business.processor.accountlibrarianstatusprocessor.AccountLibrarianStatusProcessorImpl;
import data.common.APIResponse;

import java.util.List;

public class AccountLibrarianStatusServiceImpl implements AccountLibrarianStatusService{
    private AccountLibrarianStatusProcessor accountLibrarianStatusProcessor;

    public AccountLibrarianStatusProcessor getAccountLibrarianStatusProcessor() {
        return accountLibrarianStatusProcessor;
    }

    public void setAccountLibrarianStatusProcessor(AccountLibrarianStatusProcessor accountLibrarianStatusProcessor) {
        this.accountLibrarianStatusProcessor = accountLibrarianStatusProcessor;
    }

    @Override
    public APIResponse findByPK(long id) {
        return null;
    }

    @Override
    public APIResponse listAll() {
        return null;
    }

    @Override
    public APIResponse create(AccountLibrarianStatusParam param) {
        return null;
    }

    @Override
    public APIResponse create(List<AccountLibrarianStatusParam> param) {
        return null;
    }

    @Override
    public APIResponse update(long id, AccountLibrarianStatusParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<AccountLibrarianStatusParam> param) {
        return null;
    }

    @Override
    public APIResponse deleteById(long id) {
        return null;
    }

    @Override
    public APIResponse delete(List<Long> idList) {
        return null;
    }

    @Override
    public void validateParameters(AccountLibrarianStatusParam param) {

    }

    @Override
    public void validateParameters(List<AccountLibrarianStatusParam> param) {

    }
}
