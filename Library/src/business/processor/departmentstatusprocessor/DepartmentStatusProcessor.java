package business.processor.departmentstatusprocessor;

import business.converter.departmentstatus.DepartmentStatusParam;
import business.converter.departmentstatus.DepartmentStatusResult;

import java.util.List;

public interface DepartmentStatusProcessor {
    DepartmentStatusResult create(DepartmentStatusParam param);
    List<DepartmentStatusResult> create(List<DepartmentStatusParam> param);

    void update(long id,DepartmentStatusParam param);
    void update(List<DepartmentStatusParam> param);

    void delete(long id);
    void delete(List<Long> idList);

    DepartmentStatusResult find(long id);
    List<DepartmentStatusResult> find();
}
