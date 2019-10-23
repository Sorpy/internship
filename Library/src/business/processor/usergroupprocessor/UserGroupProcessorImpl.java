package business.processor.usergroupprocessor;

import business.converter.usergroup.*;
import business.converter.usersusergroup.UsersUserGroupParam;
import dataaccess.dao.usergroupdao.UserGroupDao;
import dataaccess.dao.usergroupdao.UserGroupDaoImpl;

import java.util.List;

public class UserGroupProcessorImpl implements UserGroupProcessor{
    private UserGroupDao userGroupDao;
    private UserGroupParamConverter userGroupParamConverter;
    private UserGroupResultConverter userGroupResultConverter;

    public UserGroupDao getUserGroupDao() {
        return userGroupDao;
    }

    public void setUserGroupDao(UserGroupDao userGroupDao) {
        this.userGroupDao = userGroupDao;
    }

    public UserGroupParamConverter getUserGroupParamConverter() {
        return userGroupParamConverter;
    }

    public void setUserGroupParamConverter(UserGroupParamConverter userGroupParamConverter) {
        this.userGroupParamConverter = userGroupParamConverter;
    }

    public UserGroupResultConverter getUserGroupResultConverter() {
        return userGroupResultConverter;
    }

    public void setUserGroupResultConverter(UserGroupResultConverter userGroupResultConverter) {
        this.userGroupResultConverter = userGroupResultConverter;
    }

    @Override
    public UserGroupResult create(UsersUserGroupParam param) {
        return null;
    }

    @Override
    public List<UserGroupResult> create(List<UsersUserGroupParam> param) {
        return null;
    }

    @Override
    public void update(long id, UsersUserGroupParam param) {

    }

    @Override
    public void update(List<UsersUserGroupParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public UserGroupResult find(long id) {
        return null;
    }

    @Override
    public List<UserGroupResult> find() {
        return null;
    }
}
