package business.converter.book;

import data.entity.Book;

public interface BookResultConverter {
    BookResult convert(Book param);
}
