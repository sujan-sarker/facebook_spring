package com.springapp.mvc.dao;

import com.springapp.mvc.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Set;

/**
 * Created by sujan.sarkar on 6/23/14.
 */

@Repository
public class UserDaoImpl implements UserDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserByEmail(String email) {
        System.out.println("Email: "+ email);
        String queryString = "SELECT user FROM User user WHERE user.email = ?1";
        Query query = entityManager.createQuery(queryString);
        query.setParameter(1, email);
        List<User> users = (List<User>) query.getResultList();
        if (users.size() > 0) return users.get(0);
        return null;
    }

    @Override
    public List<User> getFriendList(int id) {

        String queryString = "SELECT f " + "FROM User u JOIN u.friends f " + "WHERE u.id=:id";
        Query query = entityManager.createQuery(queryString) .setParameter("id", id);

        return query.getResultList();

    }


}
