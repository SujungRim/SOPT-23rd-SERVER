package org.sopt;

public class User {
    private int idx;
    private String name;
    private String part;

    public void hello() {
        System.out.println("ㅇㅏㄴ녕~ 나는 " + part + "파트 " + name + "이라고 해/!");
    }

    public User() {
        this.idx = 0;
        this.name = "임수정";
        this.part = "서버";
    }

    public User(final int idx, final String name, final String part) {
        this.idx = idx;
        this.name = name;
        this.part = part;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }
}
