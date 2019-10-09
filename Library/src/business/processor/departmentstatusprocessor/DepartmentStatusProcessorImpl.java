package business.processor.departmentstatusprocessor;

import business.converter.departmentstatus.DepartmentStatusParamConverterImpl;
import business.converter.departmentstatus.DepartmentStatusResultConverterImpl;
import dataaccess.dao.departmentstatusdao.DepartmentStatusDaoImpl;

public class DepartmentStatusProcessorImpl implements DepartmentStatusProcessor{
    private DepartmentStatusDaoImpl departmentStatusDao;
    private DepartmentStatusParamConverterImpl departmentStatusParamConverter;
    private DepartmentStatusResultConverterImpl departmentStatusResultConverter;

    public DepartmentStatusDaoImpl getDepartmentStatusDao() {
        return departmentStatusDao;
    }

    public void setDepartmentStatusDao(DepartmentStatusDaoImpl departmentStatusDao) {
        this.departmentStatusDao = departmentStatusDao;
    }

    public DepartmentStatusParamConverterImpl getDepartmentStatusParamConverter() {
        return departmentStatusParamConverter;
    }

    public void setDepartmentStatusParamConverter(DepartmentStatusParamConverterImpl departmentStatusParamConverter) {
        this.departmentStatusParamConverter = departmentStatusParamConverter;
    }

    public DepartmentStatusResultConverterImpl getDepartmentStatusResultConverter() {
        return departmentStatusResultConverter;
    }

    public void setDepartmentStatusResultConverter(DepartmentStatusResultConverterImpl departmentStatusResultConverter) {
        this.departmentStatusResultConverter = departmentStatusResultConverter;
    }
}
