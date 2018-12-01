package org.sopt.model;

public class Professor {
    private int profIdx;
    private String profName;
    private String profDept;
    private String profNumber;
    private String profSubject;

    public Professor() {
    }

    public Professor(int profIdx, String profName, String profDept, String profNumber, String profSubject) {
        this.profIdx = profIdx;
        this.profName = profName;
        this.profDept = profDept;
        this.profNumber = profNumber;
        this.profSubject = profSubject;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getProfDept() {
        return profDept;
    }

    public void setProfDept(String profDept) {
        this.profDept = profDept;
    }

    public String getProfNumber() {
        return profNumber;
    }

    public void setProfNumber(String profNumber) {
        this.profNumber = profNumber;
    }

    public String getProfSubject() {
        return profSubject;
    }

    public void setProfSubject(String profSubject) {
        this.profSubject = profSubject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "profIdx=" + profIdx +
                ", profName='" + profName + '\'' +
                ", profDept='" + profDept + '\'' +
                ", profNumber='" + profNumber + '\'' +
                ", profSubject='" + profSubject + '\'' +
                '}';
    }
}
