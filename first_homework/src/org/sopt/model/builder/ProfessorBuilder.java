package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder {
    private int profIdx;
    private String profName;
    private String profDept;
    private String profNumber;
    private String profSubject;

    public ProfessorBuilder setProfIdx(final int profIdx) {
        this.profIdx = profIdx;
        return this;
    }

    public ProfessorBuilder setProfName(final String profName) {
        this.profName = profName;
        return this;
    }

    public ProfessorBuilder setProfDept(final String profDept) {
        this.profDept = profDept;
        return this;
    }

    public ProfessorBuilder setProfNumber(final String profNumber) {
        this.profNumber = profNumber;
        return this;
    }

    public ProfessorBuilder setProfSubject(final String profSubject) {
        this.profSubject = profSubject;
        return this;
    }

    public Professor build() {
        return new Professor(this.profIdx, this.profName, this.profDept, this.profNumber, this.profSubject);
    }
}
