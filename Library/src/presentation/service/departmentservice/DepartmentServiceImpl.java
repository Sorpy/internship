package presentation.service.departmentservice;

import business.converter.department.DepartmentParam;
import business.processor.departmentprocessor.DepartmentProcessor;
import business.processor.departmentprocessor.DepartmentProcessorImpl;
import data.common.APIResponse;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService{
    private DepartmentProcessor departmentProcessor;

    public DepartmentProcessor getDepartmentProcessor() {
        return departmentProcessor;
    }

    public void setDepartmentProcessor(DepartmentProcessor departmentProcessor) {
        this.departmentProcessor = departmentProcessor;
    }

    @Override
    public APIResponse findByPk(long id) {
        return null;
    }

    @Override
    public APIResponse listAll() {
        return null;
    }

    @Override
    public APIResponse create(DepartmentParam param) {
        return null;
    }

    @Override
    public APIResponse create(List<DepartmentParam> param) {
        return null;
    }

    @Override
    public APIResponse update(long id, DepartmentParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<DepartmentParam> param) {
        return null;
    }

    @Override
    public APIResponse deleteById(long id) {
        return null;
    }

    @Override
    public APIResponse delete(List<Long> idList) {
        return null;
    }

    @Override
    public void validateParameters(DepartmentParam param) {

    }

    @Override
    public void validateParameters(List<DepartmentParam> param) {

    }
}
