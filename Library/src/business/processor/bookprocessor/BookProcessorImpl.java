package business.processor.bookprocessor;

import business.converter.book.*;
import dataaccess.dao.bookdao.BookDao;
import dataaccess.dao.bookdao.BookDaoImpl;

import java.util.List;

public class BookProcessorImpl implements BookProcessor{
    private BookDao bookDao;
    private BookParamConverter bookParamConverter;
    private BookResultConverter bookResultConverter;

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookParamConverter getBookParamConverter() {
        return bookParamConverter;
    }

    public void setBookParamConverter(BookParamConverter bookParamConverter) {
        this.bookParamConverter = bookParamConverter;
    }

    public BookResultConverter getBookResultConverter() {
        return bookResultConverter;
    }

    public void setBookResultConverter(BookResultConverter bookResultConverter) {
        this.bookResultConverter = bookResultConverter;
    }

    @Override
    public BookResult create(BookParam param) {
        return null;
    }

    @Override
    public List<BookResult> create(List<BookParam> param) {
        return null;
    }

    @Override
    public void update(long id, BookParam param) {

    }

    @Override
    public void update(List<BookParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public BookResult find(long id) {
        return null;
    }

    @Override
    public List<BookResult> find() {
        return null;
    }
}
