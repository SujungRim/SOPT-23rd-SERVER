package org.sopt;

public interface UserInterface {

    public static final String DEPT = "사회과교육과";
    int DEPTNO = 320;

    public abstract void getInfo();

    String getDept();

    public default void setState(final boolean state) {
        if (state) {
            System.out.println("휴학중");
        } else {
            System.out.println("재학중");
        }
    }

    public static void world() {
        System.out.println("world!");
    }
}
