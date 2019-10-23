package business.converter.book;

import data.entity.Book;
import dataaccess.dao.bookdao.BookDao;
import dataaccess.dao.bookdao.BookDaoImpl;

public class BookParamConverterImpl implements BookParamConverter {
    private BookDao bookDao;

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Book convert(BookParam param) {
        return null;
    }
}
