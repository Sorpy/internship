package presentation.service.accountclientstatusservive;

import business.converter.accountclientstatus.AccountClientStatusParam;
import business.converter.accountclientstatus.AccountClientStatusResult;
import business.processor.accountclientstatusprocessor.AccountClientStatusProcessor;
import business.processor.accountclientstatusprocessor.AccountClientStatusProcessorImpl;
import data.common.APIResponse;
import presentation.jsonconverter.Serialization;

import java.util.List;

public class AccountClientStatusServiceImpl implements AccountClientStatusService {
    private Serialization serialization = new Serialization();
    private AccountClientStatusProcessor accountClientStatusProcessor = new AccountClientStatusProcessorImpl();

    public AccountClientStatusProcessor getAccountClientStatusProcessor() {
        return accountClientStatusProcessor;
    }

    public void setAccountClientStatusProcessor(AccountClientStatusProcessor accountClientStatusProcessor) {
        this.accountClientStatusProcessor = accountClientStatusProcessor;
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
    public APIResponse create(AccountClientStatusParam param) {
        APIResponse response = new APIResponse();
        try{
            AccountClientStatusResult accountClientResult = accountClientStatusProcessor.create(param);
            response.setText(serialization.serialization(accountClientResult));
            response.setResult(true);
        } catch (Exception e){
            response.setText("Something went wrong "+ e.toString());
            response.setResult(false);
        }

        return response;
    }

    @Override
    public APIResponse create(List<AccountClientStatusParam> param) {
        APIResponse response = new APIResponse();
        try{
            response.setResult(true);
            response.setText(serialization.serialization(accountClientStatusProcessor.create(param)));
        } catch(Exception e) {
            response.setText("Something went wrong " + e.toString());
            response.setResult(false);
        }
        return response;
    }

    @Override
    public APIResponse update(long id, AccountClientStatusParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<AccountClientStatusParam> param) {
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
    public void validateParameters(AccountClientStatusParam param) {

    }

    @Override
    public void validateParameters(List<AccountClientStatusParam> param) {

    }
}
