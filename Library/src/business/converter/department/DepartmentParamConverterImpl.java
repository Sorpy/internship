package business.converter.department;

import data.entity.Department;
import dataaccess.dao.departmentdao.DepartmentDao;
import dataaccess.dao.departmentdao.DepartmentDaoImpl;

public class DepartmentParamConverterImpl implements DepartmentParamConverter {
    private DepartmentDao departmentDao;

    public DepartmentDao getDepartmentDao() {
        return departmentDao;
    }

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public Department convert(DepartmentParam param) {
        return null;
    }
}
