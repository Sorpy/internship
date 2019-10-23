package business.processor.authorprocessor;

import business.converter.author.*;
import dataaccess.dao.authordao.AuthorDao;
import dataaccess.dao.authordao.AuthorDaoImpl;

import java.util.List;

public class AuthorProcessorImpl implements AuthorProcessor{
    private AuthorDao authorDao;
    private AuthorParamConverter authorParamConverter;

    public AuthorResultConverter getAuthorResultConverter() {
        return authorResultConverter;
    }

    public void setAuthorResultConverter(AuthorResultConverter authorResultConverter) {
        this.authorResultConverter = authorResultConverter;
    }

    private AuthorResultConverter authorResultConverter;

    public AuthorDao getAuthorDao() {
        return authorDao;
    }

    public void setAuthorDao(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    public AuthorParamConverter getAuthorParamConverter() {
        return authorParamConverter;
    }

    public void setAuthorParamConverter(AuthorParamConverter authorParamConverter) {
        this.authorParamConverter = authorParamConverter;
    }

    @Override
    public AuthorResult create(AuthorParam param) {
        return null;
    }

    @Override
    public List<AuthorResult> create(List<AuthorParam> param) {
        return null;
    }

    @Override
    public void update(long id, AuthorParam param) {

    }

    @Override
    public void update(List<AuthorParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public AuthorResult find(long id) {
        return null;
    }

    @Override
    public List<AuthorResult> find() {
        return null;
    }
}
