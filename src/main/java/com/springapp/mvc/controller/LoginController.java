package com.springapp.mvc.controller;

import com.springapp.mvc.domain.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping({"/login","/"})
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView printWelcome() {

        return new ModelAndView("login", "user", new User());
    }

    @RequestMapping(method = RequestMethod.POST)
    public String validateUser( HttpServletRequest request,@ModelAttribute("user") User user) {


            System.out.println("verifying user" + user.getEmail());
            User user1 = new User();
            user1.setEmail(user.getEmail());
            user1.setPassword(user.getPassword());

            User verifiedUser = userService.verifyUser(user1);

            if (verifiedUser != null) {
                HttpSession session = request.getSession();
                session.setAttribute("verifiedUser", verifiedUser);
                System.out.println("user verified");
                return "redirect:home";

            } else {
                request.setAttribute("message", "username or password is incorrect.");
                return "login";
            }
        }


}