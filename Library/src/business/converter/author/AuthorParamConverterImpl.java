package business.converter.author;

import data.entity.Author;
import dataaccess.dao.authordao.AuthorDao;

public class AuthorParamConverterImpl implements AuthorParamConverter{
    private AuthorDao authorDao;

    public AuthorDao getAuthorDao() {
        return authorDao;
    }

    public void setAuthorDao(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public Author convert(AuthorParam param, Author oldEntity){
        Author entity = null;
        if(oldEntity!=null){
            entity = oldEntity;
        } else {
            entity = new Author();
            entity.setId(param.getId());
            entity.setCode(param.getCode());
        }
        entity.setName(param.getName());
        entity.setDescription(param.getDescription());
        return entity;
    }
}
