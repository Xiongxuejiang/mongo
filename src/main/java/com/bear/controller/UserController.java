package com.bear.controller;
import com.bear.entity.User;
import com.bear.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

/**
 * Created by root on 3/27/17.
 */

@Controller
@RequestMapping(value = "user")
public class UserController {

    private static final Logger logger = (Logger) Logger.getLogger(UserController.class.getName());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    public String saveUser(User user){

        logger.info("OK!");
        userService.saveUser(user);
        return "success";
    }
}
