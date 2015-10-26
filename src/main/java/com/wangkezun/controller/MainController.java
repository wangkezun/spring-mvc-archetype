package com.wangkezun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangkezun on 15/10/26.
 * Just a hello world controller
 */
@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(value = {"/","/index.htm","/index.html"},method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("str","Hello, world!");
        Map<String, Object> map = new HashMap<>();
        map.put("a","Hello, world!");
        return map;
    }
}
