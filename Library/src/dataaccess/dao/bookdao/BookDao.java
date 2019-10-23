package dataaccess.dao.bookdao;

import data.entity.Book;

import java.util.List;

public interface BookDao {
    Book save(Book entity);
    List<Book> save(List<Book> entity);

    Book update(Book entity);
    List<Book> update(List<Book> entity);

    void delete(long id);
    void delete(Book entity);
    void delete(List<Long> idList);

    List<Book> find();
    Book find(long id);
}
