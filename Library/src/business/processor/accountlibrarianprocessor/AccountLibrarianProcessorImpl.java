package business.processor.accountlibrarianprocessor;

import business.converter.accountlibrarian.*;
import dataaccess.dao.accountlibrariandao.AccountLibrarianDao;
import dataaccess.dao.accountlibrariandao.AccountLibrarianDaoImpl;

import java.util.List;

public class AccountLibrarianProcessorImpl implements AccountLibrarianProcessor{
    private AccountLibrarianDao accountLibrarianDao;
    private AccountLibrarianParamConverter accountLibrarianParamConverter;
    private AccountLibrarianResultConverter accountLibrarianResultConverter;

    public AccountLibrarianDao getAccountLibrarianDao() {
        return accountLibrarianDao;
    }

    public void setAccountLibrarianDao(AccountLibrarianDao accountLibrarianDao) {
        this.accountLibrarianDao = accountLibrarianDao;
    }

    public AccountLibrarianParamConverter getAccountLibrarianParamConverter() {
        return accountLibrarianParamConverter;
    }

    public void setAccountLibrarianParamConverter(AccountLibrarianParamConverter accountLibrarianParamConverter) {
        this.accountLibrarianParamConverter = accountLibrarianParamConverter;
    }

    public AccountLibrarianResultConverter getAccountLibrarianResultConverter() {
        return accountLibrarianResultConverter;
    }

    public void setAccountLibrarianResultConverter(AccountLibrarianResultConverter accountLibrarianResultConverter) {
        this.accountLibrarianResultConverter = accountLibrarianResultConverter;
    }

    @Override
    public AccountLibrarianResult create(AccountLibrarianParam param) {
        return null;
    }

    @Override
    public List<AccountLibrarianResult> create(List<AccountLibrarianParam> param) {
        return null;
    }

    @Override
    public void update(long id, AccountLibrarianParam param) {

    }

    @Override
    public void update(List<AccountLibrarianParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public AccountLibrarianResult find(long id) {
        return null;
    }

    @Override
    public List<AccountLibrarianResult> find() {
        return null;
    }
}
