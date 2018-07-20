package com.zpark.controller;

import com.zpark.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private IUserService us;


    /**
     * c测试类
     * @param m hh
     * @return null
     */
    @RequestMapping("/test.do")
    public String test(Model m) {
        m.addAttribute("name","张三78");
        System.out.println("hello333333333");
        us.test();
        System.out.println("你好");

        new ModelAndView("hello");

        return "hello";
    }

    /**
     * c测试类2
     */
    @RequestMapping("/test2.do")
    public void test1(String username,Integer age) {
        System.out.println(username+":"+age);
    }


}
