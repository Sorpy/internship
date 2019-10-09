package business.processor.bookstatusprocessor;

import business.converter.bookstatus.BookStatusParamConverterImpl;
import business.converter.bookstatus.BookStatusResultConverterImpl;
import dataaccess.dao.bookstatusdao.BookStatusDaoImpl;

public class BookStatusProcessorImpl implements BookStatusProcessor{
    private BookStatusDaoImpl bookStatusDao;
    private BookStatusParamConverterImpl bookStatusParamConverter;
    private BookStatusResultConverterImpl bookStatusResultConverter;

    public BookStatusDaoImpl getBookStatusDao() {
        return bookStatusDao;
    }

    public void setBookStatusDao(BookStatusDaoImpl bookStatusDao) {
        this.bookStatusDao = bookStatusDao;
    }

    public BookStatusParamConverterImpl getBookStatusParamConverter() {
        return bookStatusParamConverter;
    }

    public void setBookStatusParamConverter(BookStatusParamConverterImpl bookStatusParamConverter) {
        this.bookStatusParamConverter = bookStatusParamConverter;
    }

    public BookStatusResultConverterImpl getBookStatusResultConverter() {
        return bookStatusResultConverter;
    }

    public void setBookStatusResultConverter(BookStatusResultConverterImpl bookStatusResultConverter) {
        this.bookStatusResultConverter = bookStatusResultConverter;
    }
}
