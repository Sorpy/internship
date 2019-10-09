package business.converter.departmentstatus;

import dataaccess.dao.departmentstatusdao.DepartmentStatusDaoImpl;

public class DepartmentStatusParamConverterImpl implements DepartmentStatusParamConverter  {
    private DepartmentStatusDaoImpl departmentStatusDao;

    public DepartmentStatusDaoImpl getDepartmentStatusDao() {
        return departmentStatusDao;
    }

    public void setDepartmentStatusDao(DepartmentStatusDaoImpl departmentStatusDao) {
        this.departmentStatusDao = departmentStatusDao;
    }
}
