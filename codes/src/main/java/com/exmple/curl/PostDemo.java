package com.exmple.curl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daiya on 2017/7/26.
 */
@Controller
@RequestMapping("/post")
public class PostDemo {
    @RequestMapping(value = "/test",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public String test(String name,int age){
        return String.format("{\"name\":\"%s\",\"age\":%d}",name,age);
    }
}
