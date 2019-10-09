package business.converter.usergroup;

import dataaccess.dao.usergroupdao.UserGroupDaoImpl;

public class UserGroupParamConverterImpl implements UserGroupParamConverter {
    private UserGroupDaoImpl userGroupDao;

    public UserGroupDaoImpl getUserGroupDao() {
        return userGroupDao;
    }

    public void setUserGroupDao(UserGroupDaoImpl userGroupDao) {
        this.userGroupDao = userGroupDao;
    }
}
