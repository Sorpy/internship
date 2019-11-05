package business.converter.bookstatus;

import data.entity.Book;
import data.entity.BookStatus;

public interface BookStatusParamConverter {

    BookStatus convert(BookStatusParam param, BookStatus oldEntity);
}
