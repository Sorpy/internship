package business.processor.bookprocessor;

import business.converter.book.BookParamConverterImpl;
import business.converter.book.BookResultConverterImpl;
import dataaccess.dao.bookdao.BookDaoImpl;

public class BookProcessorImpl implements BookProcessor{
    private BookDaoImpl bookDao;
    private BookParamConverterImpl bookParamConverter;
    private BookResultConverterImpl bookResultConverter;
}
