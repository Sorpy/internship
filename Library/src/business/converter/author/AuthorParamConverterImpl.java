package business.converter.author;

import dataaccess.dao.authordao.AuthorDaoImpl;

public class AuthorParamConverterImpl implements AuthorParamConverter{
    private AuthorDaoImpl authorDao;

    public AuthorDaoImpl getAuthorDao() {
        return authorDao;
    }

    public void setAuthorDao(AuthorDaoImpl authorDao) {
        this.authorDao = authorDao;
    }
}
