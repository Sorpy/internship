package business.processor.userprocessor;

import business.converter.user.*;
import dataaccess.dao.userdao.UserDao;

import java.util.List;

public class UserProcessorImpl implements UserProcessor{
    private UserDao userDao;
    private UserParamConverter userParamConverter;
    private UserResultConverter userResultConverter;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserParamConverter getUserParamConverter() {
        return userParamConverter;
    }

    public void setUserParamConverter(UserParamConverter userParamConverter) {
        this.userParamConverter = userParamConverter;
    }

    public UserResultConverter getUserResultConverter() {
        return userResultConverter;
    }

    public void setUserResultConverter(UserResultConverter userResultConverter) {
        this.userResultConverter = userResultConverter;
    }

    @Override
    public UserResult create(UserParam param) {
        return null;
    }

    @Override
    public List<UserResult> create(List<UserParam> param) {
        return null;
    }

    @Override
    public void update(long id, UserParam param) {

    }

    @Override
    public void update(List<UserParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public UserResult find(long id) {
        return null;
    }

    @Override
    public List<UserResult> find() {
        return null;
    }
}
