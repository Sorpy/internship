package business.converter.bookstatus;

import data.entity.BookStatus;

public interface BookStatusParamConverter {

    BookStatus convert(BookStatusParam param);
}
