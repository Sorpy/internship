package business.processor.usergroupprocessor;

import business.converter.usergroup.UserGroupParamConverterImpl;
import business.converter.usergroup.UserGroupResultConverterImpl;
import dataaccess.dao.usergroupdao.UserGroupDao;
import dataaccess.dao.usergroupdao.UserGroupDaoImpl;

public class UserGroupProcessorImpl implements UserGroupProcessor{
    private UserGroupDaoImpl userGroupDao;
    private UserGroupParamConverterImpl userGroupParamConverter;
    private UserGroupResultConverterImpl userGroupResultConverter;

    public UserGroupDaoImpl getUserGroupDao() {
        return userGroupDao;
    }

    public void setUserGroupDao(UserGroupDaoImpl userGroupDao) {
        this.userGroupDao = userGroupDao;
    }

    public UserGroupParamConverterImpl getUserGroupParamConverter() {
        return userGroupParamConverter;
    }

    public void setUserGroupParamConverter(UserGroupParamConverterImpl userGroupParamConverter) {
        this.userGroupParamConverter = userGroupParamConverter;
    }

    public UserGroupResultConverterImpl getUserGroupResultConverter() {
        return userGroupResultConverter;
    }

    public void setUserGroupResultConverter(UserGroupResultConverterImpl userGroupResultConverter) {
        this.userGroupResultConverter = userGroupResultConverter;
    }
}
