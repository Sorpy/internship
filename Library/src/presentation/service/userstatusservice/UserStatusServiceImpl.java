package presentation.service.userstatusservice;

import business.processor.userstatusprocessor.UserStatusProcessorImpl;

public class UserStatusServiceImpl implements UserStatusService{
    UserStatusProcessorImpl userStatusProcessor;

    public UserStatusProcessorImpl getUserStatusProcessor() {
        return userStatusProcessor;
    }

    public void setUserStatusProcessor(UserStatusProcessorImpl userStatusProcessor) {
        this.userStatusProcessor = userStatusProcessor;
    }
}
