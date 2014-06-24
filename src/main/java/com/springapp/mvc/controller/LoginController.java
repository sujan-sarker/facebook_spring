package com.springapp.mvc.controller;

import com.springapp.mvc.domain.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView printWelcome() {

        return new ModelAndView("login", "user", new User());
    }

//    @RequestMapping(method = RequestMethod.POST,
//            params = {"email", "password"})
//    public String validateUser(@RequestParam("email") String email,
//                               @RequestParam("password") String passWord,
//                               HttpServletRequest request, @Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            return "login";
//        } else {
//            User user1 = new User();
//            user.setEmail(email);
//            user.setPassword(passWord);
//
//            User verifiedUser = userService.verifyUser(user1);
//
//            if (verifiedUser != null) {
//                HttpSession session = request.getSession();
//                session.setAttribute("verifiedUser", verifiedUser);
//                System.out.println("user verified");
//                return "redirect:home";
//
//            } else {
//                request.setAttribute("message", "username or password is incorrect.");
//                return "login";
//            }
//        }
//
//    }
}