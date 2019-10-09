package presentation.service.genreservice;

import business.processor.genreprocessor.GenreProcessorImpl;

public class GenreServiceImpl implements GenreService {
    private GenreProcessorImpl genreProcessor;

    public GenreProcessorImpl getGenreProcessor() {
        return genreProcessor;
    }

    public void setGenreProcessor(GenreProcessorImpl genreProcessor) {
        this.genreProcessor = genreProcessor;
    }
}
