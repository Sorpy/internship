package business.converter.user;

import dataaccess.dao.userdao.UserDaoImpl;

public class UserParamConverterImpl implements UserParamConverter {
    private UserDaoImpl userDao;

    public UserDaoImpl getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
