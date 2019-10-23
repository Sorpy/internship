package business.converter.user;

import dataaccess.dao.userdao.UserDao;

public class UserParamConverterImpl implements UserParamConverter {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public data.entity.User convert(UserParam param) {
        return null;
    }
}
