package presentation.service.userservice;

import business.processor.userprocessor.UserProcessorImpl;

public class UserServiceImpl implements UserService{
    private UserProcessorImpl userProcessor;

    public UserProcessorImpl getUserProcessor() {
        return userProcessor;
    }

    public void setUserProcessor(UserProcessorImpl userProcessor) {
        this.userProcessor = userProcessor;
    }
}
