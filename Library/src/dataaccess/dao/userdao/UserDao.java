package dataaccess.dao.userdao;

import data.entity.User;

import java.util.List;

public interface UserDao {
    User save(User entity);
    List<User> save(List<User> entity);

    User update(User entity);
    List<User> update(List<User> entity);

    void delete(long id);
    void delete(User entity);
    void delete(List<Long> idList);

    List<User> find();
    User find(long id);
}
