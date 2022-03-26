package com.zm.controller;

import com.zm.pojo.User;
import com.zm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserControlller {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/search")
    public String searchUserList(Model model){
        List<User> list= userService.getUserList();
        model.addAttribute("list",list);
        return "allUser";
    }
    @RequestMapping("/goadduser")
    public String goaddUser(){
        return "adduser";
    }

    @RequestMapping("/adduser")
    public String addUser(User user){
        System.out.println(user);
        boolean b = userService.addUser(user);
        System.out.println("添加结果："+b);
        return "redirect:/search";
    }

    @RequestMapping("/godeluser")
    public String godelUser(){
        return "deluser";
    }
    @RequestMapping("/deluser")
    public String delUser(String name){
        System.out.println(name);
        boolean b = userService.deleteUserByName(name);
        System.out.println("删除结果："+b);
        return "redirect:/search";
    }

    @RequestMapping("/gomodifyuser")
    public String goModifyUser(){
        return "modifyuser";
    }
    @RequestMapping("/modifyuser")
    public String ModifyUser(User user){
        System.out.println(user);
        Map<String,Object> map = new HashMap<>();
        if (user.getUserName()!=null)map.put("userName",user.getUserName());
        if (user.getUserCode()!=null)map.put("userCode",user.getUserCode());
        if (user.getGender()!=null)map.put("gender",user.getGender());
        boolean b = userService.updateUser(map);
        System.out.println("修改结果："+b);
        return "redirect:/search";
    }

}
