package business.processor.authorprocessor;

import business.converter.author.AuthorParamConverterImpl;
import business.converter.author.AuthorResultConverterImpl;
import dataaccess.dao.authordao.AuthorDaoImpl;

public class AuthorProcessorImpl implements AuthorProcessor{
    private AuthorDaoImpl authorDao;
    private AuthorParamConverterImpl authorParamConverter;
    private AuthorResultConverterImpl authorResultConverter;

    public AuthorDaoImpl getAuthorDao() {
        return authorDao;
    }

    public void setAuthorDao(AuthorDaoImpl authorDao) {
        this.authorDao = authorDao;
    }

    public AuthorParamConverterImpl getAuthorParamConverter() {
        return authorParamConverter;
    }

    public void setAuthorParamConverter(AuthorParamConverterImpl authorParamConverter) {
        this.authorParamConverter = authorParamConverter;
    }
}
