package dataaccess.dao.departmentdao;

import data.entity.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentData {
    public static List<Department> departments = new ArrayList<>();
    public static Map<Long, Department> departmentMap;

    static {

        Department department1 = new Department();
        department1.setCode(45);
        department1.setDescription("This is an active client account");
        department1.setName("ActiveClientStatus");
        department1.setID((long) 1);

        Department department2 = new Department();
        department2.setCode(46);
        department2.setDescription("This is an inactive client account");
        department2.setName("InactiveClientStatus");
        department2.setID((long) 2);

        departments.add(department1);
        departments.add(department2);

        departmentMap = departments
                .stream()
                .collect(Collectors.toMap(Department::getID, item -> item));
    }
}