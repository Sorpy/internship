package presentation.service.bookservice;

import business.converter.book.BookParam;
import business.processor.bookprocessor.BookProcessor;
import business.processor.bookprocessor.BookProcessorImpl;
import data.common.APIResponse;

import java.util.List;

public class BookServiceImpl implements BookService{
    private BookProcessor bookProcessor;

    public BookProcessor getBookProcessor() {
        return bookProcessor;
    }

    public void setBookProcessor(BookProcessor bookProcessor) {
        this.bookProcessor = bookProcessor;
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
    public APIResponse create(BookParam param) {
        return null;
    }

    @Override
    public APIResponse create(List<BookParam> param) {
        return null;
    }

    @Override
    public APIResponse update(long id, BookParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<BookParam> param) {
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
    public void validateParameters(BookParam param) {

    }

    @Override
    public void validateParameters(List<BookParam> param) {

    }
}
