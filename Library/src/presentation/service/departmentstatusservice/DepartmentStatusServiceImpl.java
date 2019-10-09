package presentation.service.departmentstatusservice;

import business.processor.departmentstatusprocessor.DepartmentStatusProcessorImpl;

public class DepartmentStatusServiceImpl implements DepartmentStatusService{
    private DepartmentStatusProcessorImpl departmentStatusProcessor;

    public DepartmentStatusProcessorImpl getDepartmentStatusProcessor() {
        return departmentStatusProcessor;
    }

    public void setDepartmentStatusProcessor(DepartmentStatusProcessorImpl departmentStatusProcessor) {
        this.departmentStatusProcessor = departmentStatusProcessor;
    }
}
