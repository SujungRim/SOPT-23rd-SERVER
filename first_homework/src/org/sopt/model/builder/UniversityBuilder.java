package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {
    private int UniIdx;
    private String UniName;
    private String UniNumber;
    private String UniAddress;

    public void setUniIdx(int uniIdx) {
        UniIdx = uniIdx;
    }

    public void setUniName(String uniName) {
        UniName = uniName;
    }

    public void setUniNumber(String uniNumber) {
        UniNumber = uniNumber;
    }

    public void setUniAddress(String uniAddress) {
        UniAddress = uniAddress;
    }

    public University build() {
        return new University(this.UniIdx, this.UniName, this.UniNumber, this.UniAddress);
    }
}
