package business.converter.userstatus;

import dataaccess.dao.userstatusdao.UserStatusDaoImpl;

public class UserStatusParamConverterImpl implements UserStatusParamConverter {
    private UserStatusDaoImpl userStatusDao;

    public UserStatusDaoImpl getUserStatusDao() {
        return userStatusDao;
    }

    public void setUserStatusDao(UserStatusDaoImpl userStatusDao) {
        this.userStatusDao = userStatusDao;
    }
}
