package com.mycat.service;


import com.mycat.model.User;

import java.util.List;

/**
 * Created by tommy on 2018/6/13.
 */
public interface IUserService {
    int addUser(User user);

    User selectUser(int id);

    List<User> findAllUser(int pageNum, int pageSize);
}
