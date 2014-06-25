package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Status;
import com.springapp.mvc.domain.User;

import java.util.List;

/**
 * Created by sujan.sarkar on 6/23/14.
 */
public interface UserDao {

    public User getUserByEmail(String email);

     public List<User> getFriendList(int id);

    List<Status> getAllStatus(int id);

    public void addStatus(Status status1);

    void addUser(User user1);
}
