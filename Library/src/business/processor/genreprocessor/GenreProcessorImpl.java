package business.processor.genreprocessor;

import business.converter.genre.GenreParamConverterImpl;
import business.converter.genre.GenreResultConverterImpl;
import dataaccess.dao.genredao.GenreDaoImpl;

public class GenreProcessorImpl implements GenreProcessor{
    private GenreDaoImpl genreDao;
    private GenreParamConverterImpl genreParamConverter;
    private GenreResultConverterImpl genreResultConverter;

    public GenreDaoImpl getGenreDao() {
        return genreDao;
    }

    public void setGenreDao(GenreDaoImpl genreDao) {
        this.genreDao = genreDao;
    }

    public GenreParamConverterImpl getGenreParamConverter() {
        return genreParamConverter;
    }

    public void setGenreParamConverter(GenreParamConverterImpl genreParamConverter) {
        this.genreParamConverter = genreParamConverter;
    }

    public GenreResultConverterImpl getGenreResultConverter() {
        return genreResultConverter;
    }

    public void setGenreResultConverter(GenreResultConverterImpl genreResultConverter) {
        this.genreResultConverter = genreResultConverter;
    }
}
