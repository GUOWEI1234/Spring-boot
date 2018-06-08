package com.myboottest.springbootdemo;

import com.myboottest.springbootdemo.human.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GUOwei
 */
@RestController
public class TestController {

    @Autowired
    private Human human;

    /**
     * 通过value获取yml里面的配置
     */
    @Value("${show}")
    private String show;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String show(){
        return show + human.getHeight();
    }
}
