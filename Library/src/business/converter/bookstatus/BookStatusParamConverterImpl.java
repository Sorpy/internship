package business.converter.bookstatus;

import data.entity.BookStatus;
import dataaccess.dao.bookstatusdao.BookStatusDao;
import dataaccess.dao.bookstatusdao.BookStatusDaoImpl;

public class BookStatusParamConverterImpl implements BookStatusParamConverter {
    private BookStatusDao bookStatusDao;

    public BookStatusDao getBookStatusDao() {
        return bookStatusDao;
    }

    public void setBookStatusDao(BookStatusDao bookStatusDao) {
        this.bookStatusDao = bookStatusDao;
    }

    @Override
    public BookStatus convert(BookStatusParam param) {
        return null;
    }
}
