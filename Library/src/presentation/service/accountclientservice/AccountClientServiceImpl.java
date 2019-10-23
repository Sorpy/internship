package presentation.service.accountclientservice;

import business.converter.accountclient.AccountClientParam;
import business.converter.accountclient.AccountClientResult;
import business.processor.accountclientprocessor.AccountClientProcessor;
import business.processor.accountclientprocessor.AccountClientProcessorImpl;
import data.common.APIResponse;
import presentation.jsonconverter.Serialization;

import java.util.List;

public class AccountClientServiceImpl implements AccountClientService {
    private Serialization serialization = new Serialization();
    private AccountClientProcessor accountClientProcessor = new AccountClientProcessorImpl();

    public AccountClientProcessor getAccountClientProcessor() {
        return accountClientProcessor;
    }

    public void setAccountClientProcessor(AccountClientProcessor accountClientProcessor) {
        this.accountClientProcessor = accountClientProcessor;
    }

    @Override
    public APIResponse findByPK(long id) {
        APIResponse response = new APIResponse();
        try {
            response.setText(serialization.serialization(accountClientProcessor.find(id)));
            response.setResult(true);
        } catch (Exception e) {
            response.setText("Something went wrong " + e.toString());
            response.setResult(false);
        }
        return response;
    }

    public APIResponse findByName(String name){
        APIResponse response = new APIResponse();
        try {
            List<AccountClientResult> accountClientResults = accountClientProcessor.find(name);
            response.setText(serialization.serialization(accountClientResults));
            response.setResult(true);
        } catch (Exception e) {
            response.setText("Something went wrong " + e.toString());
            response.setResult(false);
        }

        return response;
    }

    @Override
    public APIResponse listAll() {
        APIResponse response = new APIResponse();
        try {
            List<AccountClientResult> accountClientResults = accountClientProcessor.find();
            response.setText(serialization.serialization(accountClientResults));
            response.setResult(true);
        } catch (Exception e) {
            response.setText("Something went wrong " + e.toString());
            response.setResult(false);
        }

        return response;
    }

    @Override
    public APIResponse create(AccountClientParam param) {
        APIResponse response = new APIResponse();
        try{
            AccountClientResult accountClientResult = accountClientProcessor.create(param);
            response.setText(serialization.serialization(accountClientResult));
            response.setResult(true);
        } catch (Exception e){
            response.setText("Something went wrong "+ e.toString());
            response.setResult(false);
        }

        return response;
    }

    @Override
    public APIResponse create(List<AccountClientParam> param) {
        APIResponse response = new APIResponse();
        try{
            response.setResult(true);
            response.setText(serialization.serialization(accountClientProcessor.create(param)));
        } catch(Exception e) {
            response.setText("Something went wrong " + e.toString());
            response.setResult(false);
        }
        return response;
    }

    @Override
    public APIResponse update(long id, AccountClientParam param) {
        APIResponse response = new APIResponse();
        accountClientProcessor.update(id,param);

        return response;
    }

    @Override
    public APIResponse update(List<AccountClientParam> param) {
        return null;
    }

    @Override
    public APIResponse deleteById(long id) {
        APIResponse response = new APIResponse();
        try {
            accountClientProcessor.delete(id);
            response.setResult(true);
            response.setText("deleted element with ID: " + id);
        } catch (Exception e){
            response.setText("Something went wrong " + e.toString());
            response.setResult(false);
        }

        return response;
    }

    @Override
    public APIResponse delete(List<Long> idList) {
        APIResponse response = new APIResponse();
        try {
            accountClientProcessor.delete(idList);
            response.setResult(true);
            response.setText("deleted element with IDs: " + idList.toString());
        } catch (Exception e){
            response.setText("Something went wrong " + e.toString());
            response.setResult(false);
        }

        return response;
    }

    @Override
    public void validateParameters(AccountClientParam param) {

    }

    @Override
    public void validateParameters(List<AccountClientParam> param) {

    }
}
