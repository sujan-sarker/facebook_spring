package com.springapp.mvc.controller;

import com.springapp.mvc.domain.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by sujan.sarkar on 6/23/14.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String showHomePage(ModelMap model, HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("verifiedUser");
        System.out.println("====================" + " "+ user+"==========================");
        List<User> friendList = userService.getFriendList(user.getId());
        for (User user1 : friendList) {

            System.out.println("################## " + user1.toString() + "############");
        }
        return "home";
    }
}
