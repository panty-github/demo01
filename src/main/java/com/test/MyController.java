package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pan'ting'ye
 * @since 2021/3/25 23:22
 */
@RestController
@RequestMapping("/test")
public class MyController {
    @RequestMapping("/get")
    @ResponseBody
    public String getName() {
        return "2222222！！！！";
    }
}
