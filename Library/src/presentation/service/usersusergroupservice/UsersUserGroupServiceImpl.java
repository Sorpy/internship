package presentation.service.usersusergroupservice;

import business.processor.usersusergroupprocessor.UsersUserGroupProcessorImpl;

public class UsersUserGroupServiceImpl implements UsersUserGroupService{
    private UsersUserGroupProcessorImpl usersUserGroupProcessor;

    public UsersUserGroupProcessorImpl getUsersUserGroupProcessor() {
        return usersUserGroupProcessor;
    }

    public void setUsersUserGroupProcessor(UsersUserGroupProcessorImpl usersUserGroupProcessor) {
        this.usersUserGroupProcessor = usersUserGroupProcessor;
    }
}
