package dataaccess.dao.accountclientstatusdao;

import data.entity.AccountClient;
import data.entity.AccountClientStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AccountClientStatusData {

    public static List<AccountClientStatus> accountClientStatuses = new ArrayList<>();
    public static Map<Long,AccountClientStatus> accountClientStatusMap;

    static  {
       AccountClientStatus accountClientStatus1 = new AccountClientStatus();
        accountClientStatus1.setCode(45);
        accountClientStatus1.setDescription("This is an active client account");
        accountClientStatus1.setName("ActiveClientStatus");
        accountClientStatus1.setID((long) 1);

        AccountClientStatus accountClientStatus2 = new AccountClientStatus();
        accountClientStatus2.setCode(46);
        accountClientStatus2.setDescription("This is an inactive client account");
        accountClientStatus2.setName("InactiveClientStatus");
        accountClientStatus2.setID((long) 2);

        AccountClientStatus accountClientStatus3 = new AccountClientStatus();
        accountClientStatus3.setCode(47);
        accountClientStatus3.setDescription("This is an idle client account");
        accountClientStatus3.setName("IdleClientStatus");
        accountClientStatus3.setID((long) 3);

        AccountClientStatus accountClientStatus4 = new AccountClientStatus();
        accountClientStatus4.setCode(48);
        accountClientStatus4.setDescription("somethingElse");
        accountClientStatus4.setName("SomethingElse");
        accountClientStatus4.setID((long) 4);

        accountClientStatuses.add(accountClientStatus1);
        accountClientStatuses.add(accountClientStatus2);
        accountClientStatuses.add(accountClientStatus3);
        accountClientStatuses.add(accountClientStatus4);

        accountClientStatusMap = accountClientStatuses
                .stream()
                .collect(Collectors.toMap(AccountClientStatus::getID, item -> item));
    }
}
