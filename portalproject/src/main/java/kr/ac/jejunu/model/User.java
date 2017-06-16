package kr.ac.jejunu.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by park-gunwoo on 2017. 6. 16..
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "userid")
    private String userid;
    @Column(name = "password")
    private String password;
    @Column(name = "exp")
    private String exp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
}



