package business.processor.authorprocessor;

import business.converter.author.AuthorParam;
import business.converter.author.AuthorResult;

import java.util.List;

public interface AuthorProcessor {
    AuthorResult create(AuthorParam param);
    List<AuthorResult> create(List<AuthorParam> param);

    void update(long id,AuthorParam param);
    void update(List<AuthorParam> param);

    void delete(long id);
    void delete(List<Long> idList);

    AuthorResult find(long id);
    List<AuthorResult> find();
}
