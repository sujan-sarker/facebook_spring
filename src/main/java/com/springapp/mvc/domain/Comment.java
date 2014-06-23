package com.springapp.mvc.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: sujan.sarkar
 * Date: 4/29/14
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="comment")
public class Comment {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name="status_id")
    private Status status;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
