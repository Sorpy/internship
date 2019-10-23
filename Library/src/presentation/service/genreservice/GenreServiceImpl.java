package presentation.service.genreservice;

import business.converter.genre.GenreParam;
import business.processor.genreprocessor.GenreProcessor;
import business.processor.genreprocessor.GenreProcessorImpl;
import data.common.APIResponse;

import java.util.List;

public class GenreServiceImpl implements GenreService {
    private GenreProcessor genreProcessor;

    public GenreProcessor getGenreProcessor() {
        return genreProcessor;
    }

    public void setGenreProcessor(GenreProcessor genreProcessor) {
        this.genreProcessor = genreProcessor;
    }

    @Override
    public APIResponse findByPK(long id) {
        return null;
    }

    @Override
    public APIResponse listAll() {
        return null;
    }

    @Override
    public APIResponse create(GenreParam param) {
        return null;
    }

    @Override
    public APIResponse create(List<GenreParam> param) {
        return null;
    }

    @Override
    public APIResponse update(long id, GenreParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<GenreParam> param) {
        return null;
    }

    @Override
    public APIResponse deleteById(long id) {
        return null;
    }

    @Override
    public APIResponse delete(List<Long> idList) {
        return null;
    }

    @Override
    public void validateParameters(GenreParam param) {

    }

    @Override
    public void validateParameters(List<GenreParam> param) {

    }
}
