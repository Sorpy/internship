package data.entity;

import business.converter.accountclient.AccountClientParam;
import business.converter.accountclientstatus.AccountClientStatusParam;
import com.fasterxml.jackson.core.JsonProcessingException;
import dataaccess.dao.accountclientdao.AccountClientDao;
import dataaccess.dao.accountclientdao.AccountClientDaoImpl;
import dataaccess.dao.accountclientstatusdao.AccountClientStatusData;
import dataaccess.dao.userdao.UserData;
import presentation.service.accountclientservice.AccountClientService;
import presentation.service.accountclientservice.AccountClientServiceImpl;
import presentation.service.accountclientstatusservive.AccountClientStatusService;
import presentation.service.accountclientstatusservive.AccountClientStatusServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public void test() throws JsonProcessingException {

        AccountClientService accountClientService = new AccountClientServiceImpl();
        AccountClientStatusService accountClientStatusService = new AccountClientStatusServiceImpl();
        AccountClientDao accountClientDao = new AccountClientDaoImpl();

        AccountClientStatus accountClientStatus = new AccountClientStatus();
        UserStatus userStatus = new UserStatus();
        User user1 = new User("Name","Password",userStatus);
        AccountClientParam accountClientParam = new AccountClientParam();
        accountClientParam.setFirstName("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        accountClientParam.setSecondName("OtherName");
        accountClientParam.setLastName("ThirdName");
        accountClientParam.setPhone("asdasd");
        accountClientParam.setEmail("Email");
        accountClientParam.setCountry("Bulg");
        accountClientParam.setCity("Plovdiv");
        accountClientParam.setAddress("Some Adress");
        accountClientParam.setCode(76756);
        accountClientParam.setName("AccountThing");
        accountClientParam.setDescription("Something");
        accountClientParam.setID((long) 4);
            //System.out.println(accountClientService.create(accountClientParam).getText());



        AccountClientParam accountClientParam2 = new AccountClientParam();
        accountClientParam2.setAccountClientStatusId((long)1);
        accountClientParam2.setUserId((long) 1);
        accountClientParam2.setFirstName("Name");
        accountClientParam2.setSecondName("OtherName");
        accountClientParam2.setLastName("ThirdName");
        accountClientParam2.setPhone("asdasd");
        accountClientParam2.setEmail("Email");
        accountClientParam2.setCountry("Bulg");
        accountClientParam2.setCity("Plovdiv");
        accountClientParam2.setAddress("Some Adress");
        accountClientParam2.setCode(2332456);
        accountClientParam2.setName("AccountThing");
        accountClientParam2.setDescription("Something");
        accountClientParam2.setID((long) 9);


        AccountClientStatus accountClientStatus3 = new AccountClientStatus();
        UserStatus userStatus3 = new UserStatus();
        User user3 = new User("Name","Password",userStatus3);
        AccountClientParam accountClientParam3 = new AccountClientParam();
        accountClientParam3.setFirstName("Name");
        accountClientParam3.setSecondName("OtherName");
        accountClientParam3.setLastName("ThirdName");
        accountClientParam3.setPhone("asdasd");
        accountClientParam3.setEmail("Email");
        accountClientParam3.setCountry("Bulg");
        accountClientParam3.setCity("Plovdiv");
        accountClientParam3.setAddress("Some Adress");
        accountClientParam3.setCode(233323);
        accountClientParam3.setName("AccountThing");
        accountClientParam3.setDescription("Something");
        accountClientParam3.setID((long) 10);

        //List<AccountClientParam> accountClientParamList = new ArrayList<>();
        //accountClientParamList.add(accountClientParam2);
        //accountClientParamList.add(accountClientParam3);
        //System.out.println(accountClientService.listAll().getText());

        /*System.out.println();
        System.out.println("accounts added with save arrayList" + accountClientService.create(accountClientParamList).getText());
        System.out.println();
        System.out.println("account found " + accountClientService.findByPK(7).getText());
        System.out.println();
        System.out.println(accountClientService.listAll().getText());
        System.out.println();
        System.out.println(accountClientService.deleteById(5).getText());
        System.out.println(accountClientService.listAll().getText());
        accountClientService.create(accountClientParam);

        List<Long> deleteList = new ArrayList<>();
        deleteList.add((long)6);
        deleteList.add((long)7);
        System.out.println(accountClientService.delete(deleteList).getText());
        System.out.println(accountClientService.listAll().getText());
        */
        //System.out.println(accountClientService.findByName("ivan").getText());



        /* Block for Account client Status testing

        List<AccountClientStatusParam> accountClientStatuses = new ArrayList<>();
        AccountClientStatusParam accountClientStatusParam2 = new AccountClientStatusParam();
        AccountClientStatusParam accountClientStatusParam3 = new AccountClientStatusParam();

        accountClientStatusParam2.setStatus("admin");
        accountClientStatusParam2.setCode(156);
        accountClientStatusParam2.setDescription("the account is working");
        accountClientStatusParam2.setName("AdminStatus");
        accountClientStatusParam2.setID(1);

        accountClientStatusParam3.setStatus("client");
        accountClientStatusParam3.setCode(157);
        accountClientStatusParam3.setDescription("clientThings");
        accountClientStatusParam3.setName("ClientStatus");
        accountClientStatusParam3.setID(2);

        accountClientStatuses.add(accountClientStatusParam2);
        accountClientStatuses.add(accountClientStatusParam3);

        System.out.println(accountClientStatusService.create(accountClientStatuses).getText());
        */
        //System.out.println(accountClientService.listAll().getText());
        //System.out.println(accountClientService.findByParameter("getFirstName","Ivan").getText());
        System.out.println(accountClientService.create(accountClientParam2).getText());

    }
}
