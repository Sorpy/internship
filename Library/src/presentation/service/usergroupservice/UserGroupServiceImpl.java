package presentation.service.usergroupservice;

import business.processor.usergroupprocessor.UserGroupProcessorImpl;

public class UserGroupServiceImpl implements UserGroupService{
    private UserGroupProcessorImpl userGroupProcessor;

    public UserGroupProcessorImpl getUserGroupProcessor() {
        return userGroupProcessor;
    }

    public void setUserGroupProcessor(UserGroupProcessorImpl userGroupProcessor) {
        this.userGroupProcessor = userGroupProcessor;
    }
}
