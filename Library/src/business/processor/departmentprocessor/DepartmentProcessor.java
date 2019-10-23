package business.processor.departmentprocessor;

import business.converter.department.DepartmentParam;
import business.converter.department.DepartmentResult;

import java.util.List;

public interface DepartmentProcessor {
    DepartmentResult create(DepartmentParam param);
    List<DepartmentResult> create(List<DepartmentParam> param);

    void update(long id,DepartmentParam param);
    void update(List<DepartmentParam> param);

    void delete(long id);
    void delete(List<Long> idList);

    DepartmentResult find(long id);
    List<DepartmentResult> find();
}
