package presentation.service.accountlibrarianservice;

import business.converter.accountlibrarian.AccountLibrarianParam;
import business.processor.accountlibrarianprocessor.AccountLibrarianProcessor;
import business.processor.accountlibrarianprocessor.AccountLibrarianProcessorImpl;
import data.common.APIResponse;

import java.util.List;

public class AccountLibrarianServiceImpl implements AccountLibrarianService {
    private AccountLibrarianProcessor accountLibrarianProcessor;

    public AccountLibrarianProcessor getAccountLibrarianProcessor() {
        return accountLibrarianProcessor;
    }

    public void setAccountLibrarianProcessor(AccountLibrarianProcessor accountLibrarianProcessor) {
        this.accountLibrarianProcessor = accountLibrarianProcessor;
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
    public APIResponse create(AccountLibrarianParam param) {
        return null;
    }

    @Override
    public APIResponse create(List<AccountLibrarianParam> param) {
        return null;
    }

    @Override
    public APIResponse update(long id, AccountLibrarianParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<AccountLibrarianParam> param) {
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
    public void validateParameters(AccountLibrarianParam param) {

    }

    @Override
    public void validateParameters(List<AccountLibrarianParam> param) {

    }
}
