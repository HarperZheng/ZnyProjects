package com.zny.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zny
 * Date 2021/2/28 13:37
 */
@Controller
public class FirstController {
    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndex(){
        return "zny";
    }
}
