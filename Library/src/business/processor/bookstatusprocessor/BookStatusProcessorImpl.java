package business.processor.bookstatusprocessor;

import business.converter.bookstatus.*;
import dataaccess.dao.bookstatusdao.BookStatusDao;
import dataaccess.dao.bookstatusdao.BookStatusDaoImpl;

import java.util.List;

public class BookStatusProcessorImpl implements BookStatusProcessor{
    private BookStatusDao bookStatusDao;
    private BookStatusParamConverter bookStatusParamConverter;
    private BookStatusResultConverter bookStatusResultConverter;

    public BookStatusDao getBookStatusDao() {
        return bookStatusDao;
    }

    public void setBookStatusDao(BookStatusDao bookStatusDao) {
        this.bookStatusDao = bookStatusDao;
    }

    public BookStatusParamConverter getBookStatusParamConverter() {
        return bookStatusParamConverter;
    }

    public void setBookStatusParamConverter(BookStatusParamConverter bookStatusParamConverter) {
        this.bookStatusParamConverter = bookStatusParamConverter;
    }

    public BookStatusResultConverter getBookStatusResultConverter() {
        return bookStatusResultConverter;
    }

    public void setBookStatusResultConverter(BookStatusResultConverter bookStatusResultConverter) {
        this.bookStatusResultConverter = bookStatusResultConverter;
    }

    @Override
    public BookStatusResult create(BookStatusParam param) {
        return null;
    }

    @Override
    public List<BookStatusResult> create(List<BookStatusParam> param) {
        return null;
    }

    @Override
    public void update(long id, BookStatusParam param) {

    }

    @Override
    public void update(List<BookStatusParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public BookStatusResult find(long id) {
        return null;
    }

    @Override
    public List<BookStatusResult> find() {
        return null;
    }
}
