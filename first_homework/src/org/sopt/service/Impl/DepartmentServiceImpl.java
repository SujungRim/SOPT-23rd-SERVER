package org.sopt.service.Impl;

import org.sopt.model.Department;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public Department getByDepartmentName(String DeptName) {
        final DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        return departmentBuilder.build();
    }
}
