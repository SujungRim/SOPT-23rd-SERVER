package org.sopt;

public class Main {

    public static void main(String[] args) {

        final User user1 = new User();

        final User user2 = new User(2, "최유성", "기획");

        user1.hello();
        user2.hello();

        final User2 user3 = new User2(1, "1", "1", "1",
                0, null, "1", "1",
                "1", "1", "1 ", "1", "1", "1", "1");

        final UserBuilder userBuilder = new UserBuilder();

        final User user4 = userBuilder
                .setIdx(3)
                .setName("쿠설원")
                .setPart("서버")
                .build();

        user4.hello();

        DefaultRes<User> defaultRes = new DefaultRes(user1);
    }

}
