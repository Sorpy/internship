package business.converter.bookstatus;

import dataaccess.dao.bookstatusdao.BookStatusDaoImpl;

public class BookStatusParamConverterImpl implements BookStatusParamConverter {
    private BookStatusDaoImpl bookStatusDao;

    public BookStatusDaoImpl getBookStatusDao() {
        return bookStatusDao;
    }

    public void setBookStatusDao(BookStatusDaoImpl bookStatusDao) {
        this.bookStatusDao = bookStatusDao;
    }
}
