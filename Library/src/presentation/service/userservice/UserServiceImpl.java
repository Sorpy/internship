package presentation.service.userservice;

import business.converter.user.UserParam;
import business.processor.userprocessor.UserProcessor;
import data.common.APIResponse;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserProcessor userProcessor;

    public UserProcessor getUserProcessor() {
        return userProcessor;
    }

    public void setUserProcessor(UserProcessor userProcessor) {
        this.userProcessor = userProcessor;
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
    public APIResponse create(UserParam param) {
        return null;
    }

    @Override
    public APIResponse create(List<UserParam> param) {
        return null;
    }

    @Override
    public APIResponse update(long id, UserParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<UserParam> param) {
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
    public void validateParameters(UserParam param) {

    }

    @Override
    public void validateParameters(List<UserParam> param) {

    }
}
