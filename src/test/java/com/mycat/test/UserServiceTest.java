package com.mycat.test;

import com.mycat.model.User;
import com.mycat.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by chen on 2018/03/13.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Autowired
    private IUserService userService;
    @Test
    public void getUser() throws Exception {

    }

    @Test
    public void addtUser() throws Exception {
        User user = new User();
        user.setGender(2);
        user.setName("zyp");
        userService.addUser(user);
    }

}