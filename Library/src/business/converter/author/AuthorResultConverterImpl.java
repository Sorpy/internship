package business.converter.author;

import data.entity.Author;

public class AuthorResultConverterImpl implements AuthorResultConverter{
    @Override
    public AuthorResult convert(Author param) {
        AuthorResult authorResult = new AuthorResult();
        authorResult.setCode(param.getCode());
        authorResult.setDescription(param.getDescription());
        authorResult.setId(param.getId());
        authorResult.setName(param.getName());
        return authorResult;
    }
}
