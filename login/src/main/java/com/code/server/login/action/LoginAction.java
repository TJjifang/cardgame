package com.code.server.login.action;


import com.code.server.db.Service.ServerService;
import com.code.server.db.Service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by win7 on 2017/3/8.
 */

@Controller
@EnableAutoConfiguration
public class LoginAction {

    @Autowired
    private UserService userService;

    @Autowired
    private ServerService serverService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
//        userService.test();

        return "Hello World!";
    }

    @RequestMapping("/login")
    @ResponseBody
    String login(){
        Gson gson = new Gson();
        String s = gson.toJson(serverService.getAllServerInfo().get(0));
        return s;
    }

}
