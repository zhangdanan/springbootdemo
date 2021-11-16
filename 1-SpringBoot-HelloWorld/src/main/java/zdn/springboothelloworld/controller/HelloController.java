package zdn.springboothelloworld.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zdn.springboothelloworld.domain.User;


@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/get")
    public User getUser(){
        User user=new User();
        user.setId("1");
        user.setName("zhang");
        user.setWord("nishige shabi");
        return user;
    }
}
