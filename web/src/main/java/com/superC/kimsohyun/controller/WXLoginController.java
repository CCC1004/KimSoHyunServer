package com.superc.kimsohyun.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: superC
 * @Date: 2018/11/9 11:40
 */
@RestController
public class WXLoginController {

    /**
     * 测试是否整合成功
     */
    @RequestMapping(value = "/test")
    public String testZH(){
        return "工程整合成功！！！";
    }

    /**
     * 微信登录
     */
    @PostMapping("/wxLogin")
    public String wxLogin() {
        return "ok123";
    }

}
