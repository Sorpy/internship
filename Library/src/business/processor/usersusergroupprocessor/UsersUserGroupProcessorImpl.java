package business.processor.usersusergroupprocessor;

import business.converter.usersusergroup.UsersUserGroupParamConverterImpl;
import business.converter.usersusergroup.UsersUserGroupResultConverterImpl;
import dataaccess.dao.usersusergroupdao.UsersUserGroupDaoImpl;

public class UsersUserGroupProcessorImpl implements UsersUserGroupProcessor{
    private UsersUserGroupDaoImpl usersUserGroupDao;
    private UsersUserGroupParamConverterImpl usersUserGroupParamConverter;
    private UsersUserGroupResultConverterImpl usersUserGroupResultConverter;

    public UsersUserGroupDaoImpl getUsersUserGroupDao() {
        return usersUserGroupDao;
    }

    public void setUsersUserGroupDao(UsersUserGroupDaoImpl usersUserGroupDao) {
        this.usersUserGroupDao = usersUserGroupDao;
    }

    public UsersUserGroupParamConverterImpl getUsersUserGroupParamConverter() {
        return usersUserGroupParamConverter;
    }

    public void setUsersUserGroupParamConverter(UsersUserGroupParamConverterImpl usersUserGroupParamConverter) {
        this.usersUserGroupParamConverter = usersUserGroupParamConverter;
    }

    public UsersUserGroupResultConverterImpl getUsersUserGroupResultConverter() {
        return usersUserGroupResultConverter;
    }

    public void setUsersUserGroupResultConverter(UsersUserGroupResultConverterImpl usersUserGroupResultConverter) {
        this.usersUserGroupResultConverter = usersUserGroupResultConverter;
    }
}
