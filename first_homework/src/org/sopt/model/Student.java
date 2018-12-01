package org.sopt.model;

public class Student {
    private int stdIdx;
    private String stdName;
    private int stdGrade;
    private String stdDept;
    private String stdEmail;
    private String stdAddress;
    private int stdAge;
    private String state;

    public Student() {
    }

    public Student(int stdIdx, String stdName, int stdGrade, String stdDept, String stdEmail, String stdAddress, int stdAge, String state) {
        this.stdIdx = stdIdx;
        this.stdName = stdName;
        this.stdGrade = stdGrade;
        this.stdDept = stdDept;
        this.stdEmail = stdEmail;
        this.stdAddress = stdAddress;
        this.stdAge = stdAge;
        this.state = state;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdGrade() {
        return stdGrade;
    }

    public void setStdGrade(int stdGrade) {
        this.stdGrade = stdGrade;
    }

    public String getStdDept() {
        return stdDept;
    }

    public void setStdDept(String stdDept) {
        this.stdDept = stdDept;
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        this.stdAddress = stdAddress;
    }

    public int getStdAge() {
        return stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdIdx=" + stdIdx +
                ", stdName='" + stdName + '\'' +
                ", stdGrade=" + stdGrade +
                ", stdDept='" + stdDept + '\'' +
                ", stdEmail='" + stdEmail + '\'' +
                ", stdAddress='" + stdAddress + '\'' +
                ", stdAge=" + stdAge +
                ", state='" + state + '\'' +
                '}';
    }
}
