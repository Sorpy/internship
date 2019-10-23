package business.converter.genre;

import data.entity.Genre;
import dataaccess.dao.genredao.GenreDao;
import dataaccess.dao.genredao.GenreDaoImpl;

public class GenreParamConverterImpl implements GenreParamConverter {
    private GenreDao genreDao;

    public GenreDao getGenreDao() {
        return genreDao;
    }

    public void setGenreDao(GenreDao genreDao) {
        this.genreDao = genreDao;
    }

    @Override
    public Genre convert(GenreParam param) {
        return null;
    }
}
