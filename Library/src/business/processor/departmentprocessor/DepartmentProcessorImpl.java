package business.processor.departmentprocessor;

import business.converter.department.DepartmentParamConverterImpl;
import business.converter.department.DepartmentResultConverterImpl;
import dataaccess.dao.departmentdao.DepartmentDaoImpl;

public class DepartmentProcessorImpl implements DepartmentProcessor{
    private DepartmentDaoImpl departmentDao;
    private DepartmentParamConverterImpl departmentParamConverter;
    private DepartmentResultConverterImpl departmentResultConverter;

    public DepartmentDaoImpl getDepartmentDao() {
        return departmentDao;
    }

    public void setDepartmentDao(DepartmentDaoImpl departmentDao) {
        this.departmentDao = departmentDao;
    }

    public DepartmentParamConverterImpl getDepartmentParamConverter() {
        return departmentParamConverter;
    }

    public void setDepartmentParamConverter(DepartmentParamConverterImpl departmentParamConverter) {
        this.departmentParamConverter = departmentParamConverter;
    }

    public DepartmentResultConverterImpl getDepartmentResultConverter() {
        return departmentResultConverter;
    }

    public void setDepartmentResultConverter(DepartmentResultConverterImpl departmentResultConverter) {
        this.departmentResultConverter = departmentResultConverter;
    }
}
