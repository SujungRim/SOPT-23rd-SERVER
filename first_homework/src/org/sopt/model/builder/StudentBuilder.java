package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder {
    private int stdIdx;
    private String stdName;
    private int stdGrade;
    private String stdDept;
    private String stdEmail;
    private String stdAddress;
    private int stdAge;
    private String state;

    public StudentBuilder setStdIdx(final int stdIdx) {
        this.stdIdx = stdIdx;
        return this;
    }

    public StudentBuilder setStdName(final String stdName) {
        this.stdName = stdName;
        return this;
    }

    public StudentBuilder setStdGrade(final int stdGrade) {
        this.stdGrade = stdGrade;
        return this;
    }

    public StudentBuilder setStdDept(final String stdDept) {
        this.stdDept = stdDept;
        return this;
    }

    public StudentBuilder setStdEmail(final String stdEmail) {
        this.stdEmail = stdEmail;
        return this;
    }

    public StudentBuilder setStdAddress(final String stdAddress) {
        this.stdAddress = stdAddress;
        return this;
    }

    public StudentBuilder setStdAge(final int stdAge) {
        this.stdAge = stdAge;
        return this;
    }

    public StudentBuilder setState(final String state) {
        this.state = state;
        return this;
    }

    public Student build() {
        return new Student();
    }
}
