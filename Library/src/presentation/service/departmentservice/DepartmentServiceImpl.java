package presentation.service.departmentservice;

import business.processor.departmentprocessor.DepartmentProcessorImpl;

public class DepartmentServiceImpl implements DepartmentService{
    private DepartmentProcessorImpl departmentProcessor;

    public DepartmentProcessorImpl getDepartmentProcessor() {
        return departmentProcessor;
    }

    public void setDepartmentProcessor(DepartmentProcessorImpl departmentProcessor) {
        this.departmentProcessor = departmentProcessor;
    }
}
