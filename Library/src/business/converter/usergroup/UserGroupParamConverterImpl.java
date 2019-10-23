package business.converter.usergroup;

import data.entity.UserGroup;
import dataaccess.dao.usergroupdao.UserGroupDao;
import dataaccess.dao.usergroupdao.UserGroupDaoImpl;

public class UserGroupParamConverterImpl implements UserGroupParamConverter {
    private UserGroupDao userGroupDao;

    public UserGroupDao getUserGroupDao() {
        return userGroupDao;
    }

    public void setUserGroupDao(UserGroupDao userGroupDao) {
        this.userGroupDao = userGroupDao;
    }

    @Override
    public UserGroup convert(UserGroupParam param) {
        return null;
    }
}
