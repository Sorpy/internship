package business.processor.userprocessor;

import business.converter.user.UserParamConverterImpl;
import business.converter.user.UserResultConverterImpl;
import dataaccess.dao.userdao.UserDaoImpl;

public class UserProcessorImpl implements UserProcessor{
    private UserDaoImpl userDao;
    private UserParamConverterImpl userParamConverter;
    private UserResultConverterImpl userResultConverter;

    public UserDaoImpl getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public UserParamConverterImpl getUserParamConverter() {
        return userParamConverter;
    }

    public void setUserParamConverter(UserParamConverterImpl userParamConverter) {
        this.userParamConverter = userParamConverter;
    }

    public UserResultConverterImpl getUserResultConverter() {
        return userResultConverter;
    }

    public void setUserResultConverter(UserResultConverterImpl userResultConverter) {
        this.userResultConverter = userResultConverter;
    }
}
