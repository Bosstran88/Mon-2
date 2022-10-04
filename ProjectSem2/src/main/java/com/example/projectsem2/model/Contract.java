package com.example.projectsem2.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Contract")
public class Contract {
    @Column(name = "contractid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contractid;

    @Column(name = "adminid")
    private Long adminid;

    @Column(name = "contractname")
    private String contractname;

    @Column(name = "serviceid")
    private Long serviceid;

    @Column(name = "datecontract")
    private Date datecontract;

    @Column(name = "status")
    private Integer status;

    @Column(name = "userid")
    private Long userid;

    public Long getContractid() {
        return contractid;
    }

    public void setContractid(Long contractid) {
        this.contractid = contractid;
    }

    public Long getAdminid() {
        return adminid;
    }

    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    public String getContractname() {
        return contractname;
    }

    public void setContractname(String contractname) {
        this.contractname = contractname;
    }

    public Long getServiceid() {
        return serviceid;
    }

    public void setServiceid(Long serviceid) {
        this.serviceid = serviceid;
    }

    public Date getDatecontract() {
        return datecontract;
    }

    public void setDatecontract(Date datecontract) {
        this.datecontract = datecontract;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractid=" + contractid +
                ", adminid=" + adminid +
                ", contractname='" + contractname + '\'' +
                ", serviceid=" + serviceid +
                ", datecontract=" + datecontract +
                ", status=" + status +
                ", userid=" + userid +
                '}';
    }
}
