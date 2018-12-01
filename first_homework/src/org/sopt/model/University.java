package org.sopt.model;

public class University {
    private int UniIdx;
    private String UniName;
    private String UniNumber;
    private String UniAddress;

    public University() {
    }

    public University(int uniIdx, String uniName, String uniNumber, String uniAddress) {
        UniIdx = uniIdx;
        UniName = uniName;
        UniNumber = uniNumber;
        UniAddress = uniAddress;
    }

    public String getUniName() {
        return UniName;
    }

    public void setUniName(String uniName) {
        UniName = uniName;
    }

    public String getUniNumber() {
        return UniNumber;
    }

    public void setUniNumber(String uniNumber) {
        UniNumber = uniNumber;
    }

    public String getUniAddress() {
        return UniAddress;
    }

    public void setUniAddress(String uniAddress) {
        UniAddress = uniAddress;
    }

    @Override
    public String toString() {
        return "University{" +
                "UniIdx=" + UniIdx +
                ", UniName='" + UniName + '\'' +
                ", UniNumber='" + UniNumber + '\'' +
                ", UniAddress='" + UniAddress + '\'' +
                '}';
    }
}
