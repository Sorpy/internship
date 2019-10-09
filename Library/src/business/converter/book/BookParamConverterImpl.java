package business.converter.book;

import dataaccess.dao.bookdao.BookDaoImpl;

public class BookParamConverterImpl implements BookParamConverter {
    private BookDaoImpl bookDao;

    public BookDaoImpl getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }
}
