package presentation.service.departmentstatusservice;

import business.converter.departmentstatus.DepartmentStatusParam;
import data.common.APIResponse;

import java.util.List;

public interface DepartmentStatusService {
    APIResponse findByPk(long id);
    APIResponse listAll();

    APIResponse create(DepartmentStatusParam param);
    APIResponse create(List<DepartmentStatusParam> param);

    APIResponse update(long id, DepartmentStatusParam param);
    APIResponse update(List<DepartmentStatusParam> param);

    APIResponse deleteById(long id);
    APIResponse delete(List<Long> idList);

    void validateParameters(DepartmentStatusParam param);
    void validateParameters(List<DepartmentStatusParam> param);
}
