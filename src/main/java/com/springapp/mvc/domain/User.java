package com.springapp.mvc.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * domain.User: sujan.sarkar
 * Date: 4/28/14
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="first_name", nullable=false)
    @Size(min=2, max=15)
    private String firstName;

    @Column(name="last_name", nullable=false)
    @Size(min=2, max=15)
    private String lastName;

    @NotNull @NotEmpty
    @Column(name="password", nullable=false)
    private String password;


    @NotNull @NotEmpty @Email
    @Column(name="email")
    private String email;

    @NotNull @NotEmpty
    @Column(name="dob")
    private String dob;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "friend_list",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "friend_id"))
    private List<User> users = new ArrayList<User>();

    @OneToMany(mappedBy="user")
    private List<Status> statuses = new ArrayList<Status>();

    @OneToMany(mappedBy="user")
    private List<Comment> commentList = new ArrayList<Comment>();

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Status> getStatusList() {
        return statuses;
    }

    public void setStatusList(List<Status> statusList) {
        this.statuses = statusList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
