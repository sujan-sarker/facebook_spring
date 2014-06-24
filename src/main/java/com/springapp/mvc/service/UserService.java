package com.springapp.mvc.service;

import com.springapp.mvc.dao.UserDao;
import com.springapp.mvc.domain.Status;
import com.springapp.mvc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sujan.sarkar on 6/23/14.
 */

@Service
@Transactional
public class UserService {
    @Autowired
    UserDao userDao;

    public User verifyUser(User user){

        System.out.println("Email: "+user.getEmail());

        User verifiedUser=userDao.getUserByEmail(user.getEmail());

        if(verifiedUser==null) {
            return null;
        }

        if(verifiedUser.getEmail().equals(user.getEmail()) && verifiedUser.getPassword().equals(user.getPassword())) return verifiedUser;
        return null;
    }


    public List<User> getFriendList(int id) {

        return userDao.getFriendList(id);
    }

    public List<Status> getAllStatus(int id) {
        return userDao.getAllStatus(id);
    }


    public void addSatus(Status status1) {
        userDao.addStatus(status1);
    }
}
