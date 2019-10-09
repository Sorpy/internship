package presentation.service.usergroupstatusservice;

import business.processor.usergroupstatusprocessor.UserGroupStatusProcessorImpl;

public class UserGroupStatusServiceImpl implements UserGroupStatusService{
    private UserGroupStatusProcessorImpl userGroupStatusProcessor;

    public UserGroupStatusProcessorImpl getUserGroupStatusProcessor() {
        return userGroupStatusProcessor;
    }

    public void setUserGroupStatusProcessor(UserGroupStatusProcessorImpl userGroupStatusProcessor) {
        this.userGroupStatusProcessor = userGroupStatusProcessor;
    }
}
