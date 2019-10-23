package dataaccess.dao.departmentstatusdao;

import data.entity.DepartmentStatus;

import java.util.List;

public interface DepartmentStatusDao {
    DepartmentStatus save(DepartmentStatus entity);
    List<DepartmentStatus> save(List<DepartmentStatus> entity);

    DepartmentStatus update(DepartmentStatus entity);
    List<DepartmentStatus> update(List<DepartmentStatus> entity);

    void delete(long id);
    void delete(DepartmentStatus entity);
    void delete(List<Long> idList);

    List<DepartmentStatus> find();
    DepartmentStatus find(long id);
}
