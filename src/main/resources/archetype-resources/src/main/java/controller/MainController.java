package ${package}.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Just a hello world controller
 */
@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(value = {"/","/index.htm","/index.html"},method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "Hello,world!";
    }
}
