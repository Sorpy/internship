package presentation.service.usergroupservice;

import business.converter.usergroup.UserGroupParam;
import business.processor.usergroupprocessor.UserGroupProcessor;
import business.processor.usergroupprocessor.UserGroupProcessorImpl;
import data.common.APIResponse;

import java.util.List;

public class UserGroupServiceImpl implements UserGroupService{
    private UserGroupProcessor userGroupProcessor;

    public UserGroupProcessor getUserGroupProcessor() {
        return userGroupProcessor;
    }

    public void setUserGroupProcessor(UserGroupProcessor userGroupProcessor) {
        this.userGroupProcessor = userGroupProcessor;
    }

    @Override
    public APIResponse findByPK(long id) {
        return null;
    }

    @Override
    public APIResponse listAll() {
        return null;
    }

    @Override
    public APIResponse create(UserGroupParam param) {
        return null;
    }

    @Override
    public APIResponse create(List<UserGroupParam> param) {
        return null;
    }

    @Override
    public APIResponse update(long id, UserGroupParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<UserGroupParam> param) {
        return null;
    }

    @Override
    public APIResponse deleteById(long id) {
        return null;
    }

    @Override
    public APIResponse delete(List<Long> idList) {
        return null;
    }

    @Override
    public void validateParameters(UserGroupParam param) {

    }

    @Override
    public void validateParameters(List<UserGroupParam> param) {

    }
}
