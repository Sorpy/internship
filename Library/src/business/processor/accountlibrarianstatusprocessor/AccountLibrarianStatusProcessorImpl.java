package business.processor.accountlibrarianstatusprocessor;

import business.converter.accountlibrarianstatus.*;
import dataaccess.dao.accountlibrarianstatusdao.AccountLibrarianStatusDao;
import dataaccess.dao.accountlibrarianstatusdao.AccountLibrarianStatusDaoImpl;

import java.util.List;

public class AccountLibrarianStatusProcessorImpl implements AccountLibrarianStatusProcessor{
    private AccountLibrarianStatusDao accountLibrarianStatusDao;
    private AccountLibrarianStatusParamConverter accountLibrarianStatusParamConverter;
    private AccountLibrarianStatusResultConverter accountLibrarianStatusResultConverter;

    public AccountLibrarianStatusDao getAccountLibrarianStatusDao() {
        return accountLibrarianStatusDao;
    }

    public void setAccountLibrarianStatusDao(AccountLibrarianStatusDao accountLibrarianStatusDao) {
        this.accountLibrarianStatusDao = accountLibrarianStatusDao;
    }

    public AccountLibrarianStatusParamConverter getAccountLibrarianStatusParamConverter() {
        return accountLibrarianStatusParamConverter;
    }

    public void setAccountLibrarianStatusParamConverter(AccountLibrarianStatusParamConverter accountLibrarianStatusParamConverter) {
        this.accountLibrarianStatusParamConverter = accountLibrarianStatusParamConverter;
    }

    public AccountLibrarianStatusResultConverter getAccountLibrarianStatusResultConverter() {
        return accountLibrarianStatusResultConverter;
    }

    public void setAccountLibrarianStatusResultConverter(AccountLibrarianStatusResultConverter accountLibrarianStatusResultConverter) {
        this.accountLibrarianStatusResultConverter = accountLibrarianStatusResultConverter;
    }

    @Override
    public AccountLibrarianStatusResult create(AccountLibrarianStatusParam param) {
        return null;
    }

    @Override
    public List<AccountLibrarianStatusResult> create(List<AccountLibrarianStatusParam> param) {
        return null;
    }

    @Override
    public void update(long id, AccountLibrarianStatusParam param) {

    }

    @Override
    public void update(List<AccountLibrarianStatusParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public AccountLibrarianStatusResult find(long id) {
        return null;
    }

    @Override
    public List<AccountLibrarianStatusResult> find() {
        return null;
    }
}
