package com.sunuping.sunupcrm.domain;

import javassist.SerialVersionUID;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户
 */
@Entity
@Table(name = "u_user")
public class User implements Serializable {
    private static final long serialVersionUID = 3292479270310434873L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
