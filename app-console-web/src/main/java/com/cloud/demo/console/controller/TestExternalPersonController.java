package com.cloud.demo.console.controller;

import com.cloud.demo.external.user.service.ExternalPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/27 下午4:12
 * @modified
 */
@Controller
@RequestMapping("/person")
public class TestExternalPersonController {

    @Autowired
    private ExternalPersonService externalPersonService;

    @RequestMapping(value = "/getPersonName", method = RequestMethod.GET)
    @ResponseBody
    public String getPersonName() {
        return externalPersonService.findPerson("loginName", "admin").getFdName();
    }
}
