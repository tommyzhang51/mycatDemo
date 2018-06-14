package com.mycat.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class IndexController {

    private static Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping(method = RequestMethod.GET, value = "index.htm")
    @ResponseBody
    public String index() {
        logger.info("进入index方法");
        return "Hello Spring Boot !";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    @ResponseBody
    public String index2() {
        logger.info("进入index方法");
        return "Hello Spring Boot !";
    }
}