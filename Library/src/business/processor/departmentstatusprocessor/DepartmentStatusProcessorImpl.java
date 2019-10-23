package business.processor.departmentstatusprocessor;

import business.converter.departmentstatus.*;
import dataaccess.dao.departmentstatusdao.DepartmentStatusDao;
import dataaccess.dao.departmentstatusdao.DepartmentStatusDaoImpl;

import java.util.List;

public class DepartmentStatusProcessorImpl implements DepartmentStatusProcessor{
    private DepartmentStatusDao departmentStatusDao;
    private DepartmentStatusParamConverter departmentStatusParamConverter;
    private DepartmentStatusResultConverter departmentStatusResultConverter;

    public DepartmentStatusDao getDepartmentStatusDao() {
        return departmentStatusDao;
    }

    public void setDepartmentStatusDao(DepartmentStatusDao departmentStatusDao) {
        this.departmentStatusDao = departmentStatusDao;
    }

    public DepartmentStatusParamConverter getDepartmentStatusParamConverter() {
        return departmentStatusParamConverter;
    }

    public void setDepartmentStatusParamConverter(DepartmentStatusParamConverter departmentStatusParamConverter) {
        this.departmentStatusParamConverter = departmentStatusParamConverter;
    }

    public DepartmentStatusResultConverter getDepartmentStatusResultConverter() {
        return departmentStatusResultConverter;
    }

    public void setDepartmentStatusResultConverter(DepartmentStatusResultConverter departmentStatusResultConverter) {
        this.departmentStatusResultConverter = departmentStatusResultConverter;
    }

    @Override
    public DepartmentStatusResult create(DepartmentStatusParam param) {
        return null;
    }

    @Override
    public List<DepartmentStatusResult> create(List<DepartmentStatusParam> param) {
        return null;
    }

    @Override
    public void update(long id, DepartmentStatusParam param) {

    }

    @Override
    public void update(List<DepartmentStatusParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public DepartmentStatusResult find(long id) {
        return null;
    }

    @Override
    public List<DepartmentStatusResult> find() {
        return null;
    }
}
