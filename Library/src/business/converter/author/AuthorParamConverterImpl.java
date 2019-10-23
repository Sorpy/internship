package business.converter.author;

import data.entity.Author;
import dataaccess.dao.authordao.AuthorDao;
import dataaccess.dao.authordao.AuthorDaoImpl;

public class AuthorParamConverterImpl implements AuthorParamConverter{
    private AuthorDao authorDao;

    public AuthorDao getAuthorDao() {
        return authorDao;
    }

    public void setAuthorDao(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public Author convert(AuthorParam param) {
        return null;
    }
}
