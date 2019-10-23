package business.converter.departmentstatus;

import data.entity.DepartmentStatus;
import dataaccess.dao.departmentstatusdao.DepartmentStatusDao;
import dataaccess.dao.departmentstatusdao.DepartmentStatusDaoImpl;

public class DepartmentStatusParamConverterImpl implements DepartmentStatusParamConverter  {
    private DepartmentStatusDao departmentStatusDao;

    public DepartmentStatusDao getDepartmentStatusDao() {
        return departmentStatusDao;
    }

    public void setDepartmentStatusDao(DepartmentStatusDao departmentStatusDao) {
        this.departmentStatusDao = departmentStatusDao;
    }

    @Override
    public DepartmentStatus convert(DepartmentStatusParam param) {
        return null;
    }
}
