package business.processor.genreprocessor;

import business.converter.genre.*;
import dataaccess.dao.genredao.GenreDao;
import dataaccess.dao.genredao.GenreDaoImpl;

import java.util.List;

public class GenreProcessorImpl implements GenreProcessor{
    private GenreDao genreDao;
    private GenreParamConverter genreParamConverter;
    private GenreResultConverter genreResultConverter;

    public GenreDao getGenreDao() {
        return genreDao;
    }

    public void setGenreDao(GenreDao genreDao) {
        this.genreDao = genreDao;
    }

    public GenreParamConverter getGenreParamConverter() {
        return genreParamConverter;
    }

    public void setGenreParamConverter(GenreParamConverter genreParamConverter) {
        this.genreParamConverter = genreParamConverter;
    }

    public GenreResultConverter getGenreResultConverter() {
        return genreResultConverter;
    }

    public void setGenreResultConverter(GenreResultConverter genreResultConverter) {
        this.genreResultConverter = genreResultConverter;
    }

    @Override
    public GenreResult create(GenreParam param) {
        return null;
    }

    @Override
    public List<GenreResult> create(List<GenreParam> param) {
        return null;
    }

    @Override
    public void update(long id, GenreParam param) {

    }

    @Override
    public void update(List<GenreParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public GenreResult find(long id) {
        return null;
    }

    @Override
    public List<GenreResult> find() {
        return null;
    }
}
