package business.converter.genre;

import dataaccess.dao.genredao.GenreDaoImpl;

public class GenreParamConverterImpl implements GenreParamConverter {
    private GenreDaoImpl genreDao;

    public GenreDaoImpl getGenreDao() {
        return genreDao;
    }

    public void setGenreDao(GenreDaoImpl genreDao) {
        this.genreDao = genreDao;
    }
}
