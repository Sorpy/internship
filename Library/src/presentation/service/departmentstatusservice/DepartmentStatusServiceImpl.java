package presentation.service.departmentstatusservice;

import business.converter.departmentstatus.DepartmentStatusParam;
import business.processor.departmentstatusprocessor.DepartmentStatusProcessor;
import business.processor.departmentstatusprocessor.DepartmentStatusProcessorImpl;
import data.common.APIResponse;

import java.util.List;

public class DepartmentStatusServiceImpl implements DepartmentStatusService{
    private DepartmentStatusProcessor departmentStatusProcessor;

    public DepartmentStatusProcessor getDepartmentStatusProcessor() {
        return departmentStatusProcessor;
    }

    public void setDepartmentStatusProcessor(DepartmentStatusProcessor departmentStatusProcessor) {
        this.departmentStatusProcessor = departmentStatusProcessor;
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
    public APIResponse create(DepartmentStatusParam param) {
        return null;
    }

    @Override
    public APIResponse create(List<DepartmentStatusParam> param) {
        return null;
    }

    @Override
    public APIResponse update(long id, DepartmentStatusParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<DepartmentStatusParam> param) {
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
    public void validateParameters(DepartmentStatusParam param) {

    }

    @Override
    public void validateParameters(List<DepartmentStatusParam> param) {

    }
}
