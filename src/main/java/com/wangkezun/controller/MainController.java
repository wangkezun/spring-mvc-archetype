package com.wangkezun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangkezun on 15/10/26.
 * Just a hello world controller
 */
@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(value = {"/","/index.htm","/index.html"},method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("str","Hello, world!");
        return mav;
    }
}
