package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by sujan.sarkar on 6/23/14.
 */
@Controller
@RequestMapping("/logout")
public class LogoutController {

    @RequestMapping(method = RequestMethod.GET)
    public String doLogOut(HttpServletRequest request) {

        HttpSession session = request.getSession();
        session.invalidate();
        return "redirect:login";
    }
}
