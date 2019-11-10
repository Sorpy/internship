package business.converter.book;

import data.entity.Book;
import dataaccess.dao.authordao.AuthorDao;
import dataaccess.dao.authordao.AuthorDaoImpl;
import dataaccess.dao.bookstatusdao.BookStatusDao;
import dataaccess.dao.bookstatusdao.BookStatusDaoImpl;
import dataaccess.dao.departmentdao.DepartmentDao;
import dataaccess.dao.departmentdao.DepartmentDaoImpl;
import dataaccess.dao.genredao.GenreDao;
import dataaccess.dao.genredao.GenreDaoImpl;

public class BookParamConverterImpl implements BookParamConverter {
    private BookStatusDao bookStatusDao = new BookStatusDaoImpl();
    private AuthorDao authorDao= new AuthorDaoImpl();
    private GenreDao genreDao=new GenreDaoImpl();
    private DepartmentDao departmentDao = new DepartmentDaoImpl();

    @Override
    public Book convert(BookParam param, Book oldEntity){
        Book entity = null;
        if(oldEntity!=null){
            entity = oldEntity;
        } else {
            entity = new Book();
            entity.setId(param.getId());
            entity.setCode(param.getCode());
        }
        entity.setName(param.getName());
        entity.setDescription(param.getDescription());
        entity.setYear(param.getYear());
        entity.setPrice(param.getPrice());
        entity.setBookName(param.getBookName());
        entity.setBookStatus(bookStatusDao.find(param.getBookStatusId()));
        entity.setAuthor(authorDao.find(param.getAuthorId()));
        entity.setGenre(genreDao.find(param.getGenreId()));
        entity.setDepartment(departmentDao.find(param.getDepartmentId()));
        return entity;
    }
}
