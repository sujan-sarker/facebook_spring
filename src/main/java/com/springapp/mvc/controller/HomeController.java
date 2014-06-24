package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Status;
import com.springapp.mvc.domain.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by sujan.sarkar on 6/23/14.
 */
@Controller
@RequestMapping({"/home","/status"})
@SessionAttributes("user")
public class HomeController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String showHomePage(ModelMap model, HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("verifiedUser");
        List<User> friendList = userService.getFriendList(user.getId());
        List<Status> statuses = userService.getAllStatus(user.getId());
        model.addAttribute("friendList",friendList);
        model.addAttribute("statuses",statuses);
        return "home";
    }

    @RequestMapping(method=RequestMethod.POST)

    public String addPost(@RequestParam("status")String status,ModelMap model,HttpServletRequest request ) {
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("verifiedUser");
        Status status1 = new Status();
        status1.setUser(user);
        status1.setStatus(status);
        userService.addSatus(status1);
        return "redirect:home";
    }


}
