package business.converter.book;

import data.entity.Book;

public class BookResultConverterImpl implements BookResultConverter {
    @Override
    public BookResult convert(Book param) { //TODO ADD STRING NAMES AND STATUSES
            BookResult bookResult = new BookResult();
            bookResult.setBookName(param.getBookName());
            bookResult.setAuthorName(param.getAuthor().getAuthorName());
            bookResult.setBookStatusName(param.getBookStatus().getName());
            bookResult.setBookStatusId(param.getBookStatus().getID());
            bookResult.setDepartmentName(param.getDepartment().getName());
            bookResult.setGenreName(param.getAuthor().getAuthorName());
            bookResult.setPrice(param.getPrice());
            bookResult.setYear(param.getYear());
            bookResult.setCode(param.getCode());
            bookResult.setName(param.getName());
            bookResult.setDescription(param.getDescription());
            bookResult.setID(param.getID());
            return bookResult;
    }
}
