package org.sopt.model;

public class Department extends University {
    private int deptIdx;
    private String deptName;
    private String deptNumber;
    private String deptType;

    public Department() {
    }

    public Department(int deptIdx, String deptName, String deptNumber, String deptType) {
        this.deptIdx = deptIdx;
        this.deptName = deptName;
        this.deptNumber = deptNumber;
        this.deptType = deptType;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptIdx=" + deptIdx +
                ", deptName='" + deptName + '\'' +
                ", deptNumber='" + deptNumber + '\'' +
                ", deptType='" + deptType + '\'' +
                '}';
    }
}
