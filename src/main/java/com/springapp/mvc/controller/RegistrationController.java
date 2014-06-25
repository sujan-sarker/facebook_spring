package com.springapp.mvc.controller;

import com.springapp.mvc.domain.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by sujan.sarkar on 6/25/14.
 */
@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showRegistrationPage() {

        return new ModelAndView("registration", "user", new User());
    }

    @RequestMapping(method = RequestMethod.POST)
    public String validateUser( HttpServletRequest request, @Valid @ModelAttribute("user") User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            System.out.println("validation Error");
            return "registration";
        } else {

            User user1 = new User();
            user1.setFirstName(user.getFirstName());
            user1.setLastName(user.getLastName());
            user1.setEmail(user.getEmail());
            user1.setDob(user.getDob());
            user1.setPassword(user.getPassword());
            userService.addUser(user1);

            HttpSession session = request.getSession();
            session.setAttribute("verifiedUser", user1);
            return "redirect:home";
        }

    }
}

