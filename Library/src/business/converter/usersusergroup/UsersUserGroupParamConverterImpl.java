package business.converter.usersusergroup;

import dataaccess.dao.usersusergroupdao.UsersUserGroupDaoImpl;

public class UsersUserGroupParamConverterImpl implements UsersUserGroupParamConverter {
    private UsersUserGroupDaoImpl usersUserGroupDao;

    public UsersUserGroupDaoImpl getUsersUserGroupDao() {
        return usersUserGroupDao;
    }

    public void setUsersUserGroupDao(UsersUserGroupDaoImpl usersUserGroupDao) {
        this.usersUserGroupDao = usersUserGroupDao;
    }
}
