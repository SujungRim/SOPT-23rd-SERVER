package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder {
    private int deptIdx;
    private String deptName;
    private String deptNumber;
    private String deptType;

    public DepartmentBuilder setDeptIdx(final int deptIdx) {
        this.deptIdx = deptIdx;
        return this;
    }

    public DepartmentBuilder setDeptName(final String deptName) {
        this.deptName = deptName;
        return this;
    }

    public DepartmentBuilder setDeptNumber(final String deptNumber) {
        this.deptNumber = deptNumber;
        return this;
    }

    public DepartmentBuilder setDeptType(final String deptType) {
        this.deptType = deptType;
        return this;
    }

    public Department build() {
        return new Department(this.deptIdx, this.deptName, this.deptNumber, this.deptType);
    }
}
