package presentation.service.bookstatusservice;

import business.converter.bookstatus.BookStatusParam;
import business.processor.bookstatusprocessor.BookStatusProcessor;
import business.processor.bookstatusprocessor.BookStatusProcessorImpl;
import data.common.APIResponse;

import java.util.List;

public class BookStatusServiceImpl implements BookStatusService{
    private BookStatusProcessor bookStatusProcessor;

    public BookStatusProcessor getBookStatusProcessor() {
        return bookStatusProcessor;
    }

    public void setBookStatusProcessor(BookStatusProcessor bookStatusProcessor) {
        this.bookStatusProcessor = bookStatusProcessor;
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
    public APIResponse create(BookStatusParam param) {
        return null;
    }

    @Override
    public APIResponse create(List<BookStatusParam> param) {
        return null;
    }

    @Override
    public APIResponse update(long id, BookStatusParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<BookStatusParam> param) {
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
    public void validateParameters(BookStatusParam param) {

    }

    @Override
    public void validateParameters(List<BookStatusParam> param) {

    }
}
