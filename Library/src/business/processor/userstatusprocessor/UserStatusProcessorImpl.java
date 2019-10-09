package business.processor.userstatusprocessor;

import business.converter.userstatus.UserStatusParamConverterImpl;
import business.converter.userstatus.UserStatusResultConverterImpl;
import dataaccess.dao.userstatusdao.UserStatusDaoImpl;

public class UserStatusProcessorImpl implements UserStatusProcessor{
    private UserStatusDaoImpl userStatusDao;
    private UserStatusParamConverterImpl userStatusParamConverter;
    private UserStatusResultConverterImpl userStatusResultConverter;

    public UserStatusDaoImpl getUserStatusDao() {
        return userStatusDao;
    }

    public void setUserStatusDao(UserStatusDaoImpl userStatusDao) {
        this.userStatusDao = userStatusDao;
    }

    public UserStatusParamConverterImpl getUserStatusParamConverter() {
        return userStatusParamConverter;
    }

    public void setUserStatusParamConverter(UserStatusParamConverterImpl userStatusParamConverter) {
        this.userStatusParamConverter = userStatusParamConverter;
    }

    public UserStatusResultConverterImpl getUserStatusResultConverter() {
        return userStatusResultConverter;
    }

    public void setUserStatusResultConverter(UserStatusResultConverterImpl userStatusResultConverter) {
        this.userStatusResultConverter = userStatusResultConverter;
    }
}
