package com.crystal.report3.service;

import com.crystal.report3.model.DefaultRes;
import com.crystal.report3.model.User;

import java.util.HashMap;
import java.util.List;

public interface UserService {

   DefaultRes<List<User>> findUserByParam(HashMap<String, String> paramMap);

   DefaultRes<User> findByUserIdx(final int userIdx);

   DefaultRes save (final User user);

   DefaultRes<User> updateByUserIdx (final int userIdx, final User nextUser);

   DefaultRes deleteByUserIdx (final int userIdx);

}
