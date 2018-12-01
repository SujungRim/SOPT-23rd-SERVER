package com.crystal.report3.service.impl;

import com.crystal.report3.exception.NotFoundUserException;
import com.crystal.report3.model.DefaultRes;
import com.crystal.report3.model.User;
import com.crystal.report3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private static List<User> userList = new LinkedList<>();

    @Override
    public DefaultRes<List<User>> findUserByParam(HashMap<String, String> paramMap) {
        String name = paramMap.get("name");
        String part = paramMap.get("part");

        List<User> users = userList;

        if (name != null) {
            users = userList
                    .stream()
                    .filter(user -> user.isSameName(name))
                    .collect(Collectors.toList());
        }

        if (part != null) {
            users = userList
                    .stream()
                    .filter(user -> user.isSamePart(part))
                    .collect(Collectors.toList());
        }

        if (users.isEmpty()) throw new NotFoundUserException();

        return DefaultRes.res(HttpStatus.OK.value(), "리스트 조회 성공", users);
    }

    @Override
    public DefaultRes<User> findByUserIdx(int userIdx) {
        User foundUser = userList
                .stream()
                .filter(user -> user.isSameId(userIdx))
                .findFirst()
                .orElseThrow(NotFoundUserException::new);

        return DefaultRes.res(HttpStatus.OK.value(), "아이디로 회원 조회 성공", foundUser);
    }

    @Override
    public DefaultRes save(User newUser) {

        if(userList.stream().anyMatch(user -> user.isSameId(newUser.getUserIdx())))
            return DefaultRes.res(HttpStatus.CONFLICT.value(), "회원 중복");

        userList.add(newUser);
        return DefaultRes.res(HttpStatus.OK.value(), "회원 저장 성공");

    }

    @Override
    public DefaultRes updateByUserIdx(int userIdx, User nextUser) {
        User prevUser = userList
                .stream()
                .filter(user -> user.isSameId(userIdx))
                .findFirst()
                .orElseThrow(NotFoundUserException::new);

        prevUser.update(nextUser);
        return DefaultRes.res(HttpStatus.OK.value(), "회원 업데이트 성공", nextUser);
    }

    @Override
    public DefaultRes deleteByUserIdx(int userIdx) {
        User prevUser = userList
                .stream()
                .filter(user -> user.isSameId(userIdx))
                .findFirst()
                .orElseThrow(NotFoundUserException::new);

        userList.remove(prevUser);
        return DefaultRes.res(HttpStatus.OK.value(), "회원 삭제 성공");
    }
}
