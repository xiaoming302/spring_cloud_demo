package com.cloud.demo.sys;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/24 下午10:11
 * @modified
 */
@RestController
public class TestController {

    //@Value("${spring.datasource.druid.url}")
    private String name;

    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    public String getName() {
        return name;
    }
}
