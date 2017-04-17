package com.ashkin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ashkin
 *         2017/4/17
 */
@Controller
public class HelloController {
    @RequestMapping(path = "/hello")
    public String hello() {
        return "hello";
    }
}
