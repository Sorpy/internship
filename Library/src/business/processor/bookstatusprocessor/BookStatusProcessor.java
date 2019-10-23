package business.processor.bookstatusprocessor;

import business.converter.bookstatus.BookStatusParam;
import business.converter.bookstatus.BookStatusResult;

import java.util.List;

public interface BookStatusProcessor {
    BookStatusResult create(BookStatusParam param);
    List<BookStatusResult> create(List<BookStatusParam> param);

    void update(long id,BookStatusParam param);
    void update(List<BookStatusParam> param);

    void delete(long id);
    void delete(List<Long> idList);

    BookStatusResult find(long id);
    List<BookStatusResult> find();
}
