package business.converter.author;

import data.entity.Author;

public interface AuthorParamConverter {

    Author convert(AuthorParam param, Author oldEntity);
}
