package com.monkeyjesus.properties.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by MonkeyJesus on 2017/4/19.
 */
@Controller
public class Test {

//    @Value("#{dataSource.key1}")
    private String testKey;

    @RequestMapping(value = "aa")
    public String returnString(){
        return testKey;
    }


    @RequestMapping(value = "bb")
    public @ResponseBody String bb(){
        return "success";
    }


    @RequestMapping(value = "cc")
    public @ResponseBody String cc(){
        return testKey;
    }

//    public static void main(String[] args){
//        System.out.println(testKey);
//        System.out.println(testKey);
//        System.out.println(testKey);
//    }
}
