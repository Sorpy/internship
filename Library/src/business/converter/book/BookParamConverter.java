package business.converter.book;


import data.entity.Book;

public interface BookParamConverter {
    Book convert(BookParam param);
}
