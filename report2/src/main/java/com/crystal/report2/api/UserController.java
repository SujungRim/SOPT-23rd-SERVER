package com.crystal.report2.api;

import com.crystal.report2.exception.NotFoundUserException;
import com.crystal.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    private static List<User> userList = new LinkedList<>();

    /**
     * 현재날짜시간 반환
     *
     * @return 현재날짜시간
     */
    @GetMapping("/")
    public String getNowDate() {
        return new Date().toString();
    }


    /**
     * 이름으로 회원 조회 또는 파트로 회원 조회, param이 없다면 전체 회원 조회
     *
     * @param paramMap
     * @return 회원리스트
     */
    @GetMapping("/users")
    public List<User> getUsers(@RequestParam HashMap<String, String> paramMap) {
        List<User> users = findUsersByParam(paramMap);

        if (users.isEmpty()) throw new NotFoundUserException();

        return users;
    }

    private List<User> findUsersByParam(HashMap<String, String> paramMap) {
        String name = paramMap.get("name");
        String part = paramMap.get("part");

        if (name != null) {
            return userList
                    .stream()
                    .filter(user -> user.isSameName(name))
                    .collect(Collectors.toList());
        }

        if (part != null) {
            return userList
                    .stream()
                    .filter(user -> user.isSamePart(part))
                    .collect(Collectors.toList());
        }

        return userList;
    }


    /**
     * 회원아이디로 조회
     *
     * @param user_idx
     * @return 회원
     */
    @GetMapping("/users/{user_idx}")
    public User getUserbyId(@PathVariable(value = "user_idx") final int user_idx) {
        return userList
                .stream()
                .filter(user -> user.isSameId(user_idx))
                .findFirst()
                .orElseThrow(NotFoundUserException::new);
    }


    /**
     * 회원 저장
     *
     * @param user
     */
    @PostMapping("/users")
    public void saveUser(@RequestBody final User user) {
        userList.add(user);
    }


    /**
     * 회원 수정
     *
     * @param user_idx
     * @param nextUser
     */
    @PutMapping("/users/{user_idx}")
    public void updateUser(@PathVariable(value = "user_idx") final int user_idx, @RequestBody final User nextUser) {
        User prevUser = userList
                .stream()
                .filter(user -> user.isSameId(user_idx))
                .findFirst()
                .orElseThrow(NotFoundUserException::new);

        prevUser.update(nextUser);

    }


    /**
     * 회원 삭제
     *
     * @param user_idx
     */
    @DeleteMapping("/users/{user_idx}")
    public void deleteUser(@PathVariable(value = "user_idx") final int user_idx) {
        User prevUser = userList
                .stream()
                .filter(user -> user.isSameId(user_idx))
                .findFirst()
                .orElseThrow(NotFoundUserException::new);

        userList.remove(prevUser);
    }
}
