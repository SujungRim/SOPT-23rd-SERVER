package com.crystal.report3.api;

import com.crystal.report3.model.DefaultRes;
import com.crystal.report3.model.User;
import com.crystal.report3.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

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
    public DefaultRes<List<User>> getUsers(@RequestParam HashMap<String, String> paramMap) {
        return userService.findUserByParam(paramMap);
    }


    /**
     * 회원아이디로 조회
     *
     * @param userIdx
     * @return 회원
     */
    @GetMapping("/users/{userIdx}")
    public DefaultRes<User> getUserbyId(@PathVariable(value = "userIdx") final int userIdx) {
        return userService.findByUserIdx(userIdx);
    }


    /**
     * 회원 저장
     *
     * @param user
     */
    @PostMapping("/users")
    public DefaultRes saveUser(@RequestBody final User user) {
        return userService.save(user);
    }


    /**
     * 회원 수정
     *
     * @param userIdx
     * @param nextUser
     */
    @PutMapping("/users/{userIdx}")
    public DefaultRes updateUser(@PathVariable(value = "userIdx") final int userIdx, @RequestBody final User nextUser) {
        return userService.updateByUserIdx(userIdx, nextUser);

    }


    /**
     * 회원 삭제
     *
     * @param userIdx
     */
    @DeleteMapping("/users/{userIdx}")
    public DefaultRes deleteUser(@PathVariable(value = "userIdx") final int userIdx) {
        return userService.deleteByUserIdx(userIdx);
    }
}
