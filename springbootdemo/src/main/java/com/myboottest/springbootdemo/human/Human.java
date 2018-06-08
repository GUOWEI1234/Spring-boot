package com.myboottest.springbootdemo.human;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author GUOwei
 * 把配置写入一个类里面
 */
@Component
@ConfigurationProperties(prefix = "human")
public class Human {

    private Integer age;

    private Integer height;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
