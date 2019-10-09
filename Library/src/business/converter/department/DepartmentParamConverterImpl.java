package business.converter.department;

import dataaccess.dao.departmentdao.DepartmentDaoImpl;

public class DepartmentParamConverterImpl implements DepartmentParamConverter {
    private DepartmentDaoImpl departmentDao;

    public DepartmentDaoImpl getDepartmentDao() {
        return departmentDao;
    }

    public void setDepartmentDao(DepartmentDaoImpl departmentDao) {
        this.departmentDao = departmentDao;
    }
}
