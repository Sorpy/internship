package business.processor.genreprocessor;

import business.converter.genre.GenreParam;
import business.converter.genre.GenreResult;

import java.util.List;

public interface GenreProcessor {
    GenreResult create(GenreParam param);
    List<GenreResult> create(List<GenreParam> param);

    void update(long id,GenreParam param);
    void update(List<GenreParam> param);

    void delete(long id);
    void delete(List<Long> idList);

    GenreResult find(long id);
    List<GenreResult> find();
}
