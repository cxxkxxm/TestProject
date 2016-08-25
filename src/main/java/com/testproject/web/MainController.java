package com.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sibie on 8/23/2016.
 */

@Controller
public class MainController {
    @RequestMapping("/")
    public ModelAndView index (@RequestParam(value = "name", required = false) String name) { // error - String variable not found?
        Map<String, Object> model = new HashMap<>();
        model.put("name", name);
        return new ModelAndView("/index", model);
    }
}