package com.exmple.curl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by daiya on 2017/7/26.
 */
@Controller
@RequestMapping("/get")
public class GetDemo{
    @RequestMapping(value = "/getjson",method = RequestMethod.GET,produces = "text/html;charset=utf-8")
    public String getJson(@RequestParam String name,
                          @RequestParam int age){
        return String.format("{\"name\":\"%s\",\"age\":%d}",name,age);
    }
}
