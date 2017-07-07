package kr.ac.jejunu.model;

import org.exolab.castor.types.DateTime;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by park-gunwoo on 2017. 6. 15..
 */

@Entity
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "comment")
    private String comment;
    @Column(name= "good")
    private int good;
    @Column(name= "bad")
    private int bad;

//    @Temporal(TemporalType.DATE)
    @Column(name= "time", nullable = true)
    private Timestamp time;

    public Reply() {
        Reply reply;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getGood() {
        return good;
    }

    public void setGood(int good) {
        this.good = good;
    }

    public int getBad() {
        return bad;
    }

    public void setBad(int bad) {
        this.bad = bad;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

}
