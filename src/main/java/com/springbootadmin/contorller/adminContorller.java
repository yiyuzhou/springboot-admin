package com.springbootadmin.contorller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author by yiyuzhou
 * on 2018/11/12
 */

@Controller
@EnableAutoConfiguration
public class adminContorller {

    @RequestMapping("/index")
    @ResponseBody
    String index() {
        return "Hello ,spring boot!";
    }
}
