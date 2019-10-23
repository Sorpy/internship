package business.processor.departmentprocessor;

import business.converter.department.*;
import dataaccess.dao.departmentdao.DepartmentDao;
import dataaccess.dao.departmentdao.DepartmentDaoImpl;

import java.util.List;

public class DepartmentProcessorImpl implements DepartmentProcessor{
    private DepartmentDao departmentDao;
    private DepartmentParamConverter departmentParamConverter;
    private DepartmentResultConverter departmentResultConverter;

    public DepartmentDao getDepartmentDao() {
        return departmentDao;
    }

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public DepartmentParamConverter getDepartmentParamConverter() {
        return departmentParamConverter;
    }

    public void setDepartmentParamConverter(DepartmentParamConverter departmentParamConverter) {
        this.departmentParamConverter = departmentParamConverter;
    }

    public DepartmentResultConverter getDepartmentResultConverter() {
        return departmentResultConverter;
    }

    public void setDepartmentResultConverter(DepartmentResultConverter departmentResultConverter) {
        this.departmentResultConverter = departmentResultConverter;
    }

    @Override
    public DepartmentResult create(DepartmentParam param) {
        return null;
    }

    @Override
    public List<DepartmentResult> create(List<DepartmentParam> param) {
        return null;
    }

    @Override
    public void update(long id, DepartmentParam param) {

    }

    @Override
    public void update(List<DepartmentParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public DepartmentResult find(long id) {
        return null;
    }

    @Override
    public List<DepartmentResult> find() {
        return null;
    }
}
