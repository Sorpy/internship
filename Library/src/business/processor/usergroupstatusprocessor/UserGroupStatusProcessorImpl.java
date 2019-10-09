package business.processor.usergroupstatusprocessor;

import business.converter.usergroupstatus.UserGroupStatusParamConverterImpl;
import business.converter.usergroupstatus.UserGroupStatusResultConverterImpl;
import dataaccess.dao.usergroupstatusdao.UserGroupStatusDaoImpl;

public class UserGroupStatusProcessorImpl implements UserGroupStatusProcessor{
    private UserGroupStatusDaoImpl userGroupStatusDao;
    private UserGroupStatusParamConverterImpl userGroupStatusParamConverter;
    private UserGroupStatusResultConverterImpl userGroupStatusResultConverter;

    public UserGroupStatusDaoImpl getUserGroupStatusDao() {
        return userGroupStatusDao;
    }

    public void setUserGroupStatusDao(UserGroupStatusDaoImpl userGroupStatusDao) {
        this.userGroupStatusDao = userGroupStatusDao;
    }

    public UserGroupStatusParamConverterImpl getUserGroupStatusParamConverter() {
        return userGroupStatusParamConverter;
    }

    public void setUserGroupStatusParamConverter(UserGroupStatusParamConverterImpl userGroupStatusParamConverter) {
        this.userGroupStatusParamConverter = userGroupStatusParamConverter;
    }

    public UserGroupStatusResultConverterImpl getUserGroupStatusResultConverter() {
        return userGroupStatusResultConverter;
    }

    public void setUserGroupStatusResultConverter(UserGroupStatusResultConverterImpl userGroupStatusResultConverter) {
        this.userGroupStatusResultConverter = userGroupStatusResultConverter;
    }
}
