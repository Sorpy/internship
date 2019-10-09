package business.converter.usergroupstatus;

import dataaccess.dao.usergroupstatusdao.UserGroupStatusDaoImpl;

public class UserGroupStatusParamConverterImpl implements UserGroupStatusParamConverter {
    private UserGroupStatusDaoImpl userGroupStatusDao;

    public UserGroupStatusDaoImpl getUserGroupStatusDao() {
        return userGroupStatusDao;
    }

    public void setUserGroupStatusDao(UserGroupStatusDaoImpl userGroupStatusDao) {
        this.userGroupStatusDao = userGroupStatusDao;
    }
}
