package com.example.projectsem2.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "bo_user")
public class UserBO {
    @Column(name="userid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;

    @Column(name="name")
    private String name;

    @Column(name = "gmail")
    private String gmail;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "datebirth")
    private Date datebirth;

    @Column(name = "createtime")
    private Timestamp createtime;

    public UserBO(){}

    public UserBO(Long userid, String name, String gmail, Integer phone, Date datebirth, Timestamp createtime) {
        this.userid = userid;
        this.name = name;
        this.gmail = gmail;
        this.phone = phone;
        this.datebirth = datebirth;
        this.createtime = createtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserBO userBO)) return false;
        return userid.equals(userBO.userid) && name.equals(userBO.name) && gmail.equals(userBO.gmail) && phone.equals(userBO.phone) && datebirth.equals(userBO.datebirth) && createtime.equals(userBO.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, name, gmail, phone, datebirth, createtime);
    }

    @Override
    public String toString() {
        return "UserBO{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                ", phone=" + phone +
                ", datebirth=" + datebirth +
                ", createtime=" + createtime +
                '}';
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(Date datebirth) {
        this.datebirth = datebirth;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }
}
