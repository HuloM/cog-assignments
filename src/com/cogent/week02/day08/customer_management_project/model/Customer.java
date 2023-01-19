package com.cogent.week02.day08.customer_management_project.model;

import java.util.Date;

public class Customer {
    private int cId;
    private String cName;
    private String cEmail;
    private Date cDob;



    public Customer(int cId, String cName, String cEmail, Date cDob) {
        this.cId = cId;
        this.cName = cName;
        this.cEmail = cEmail;
        this.cDob = cDob;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public Date getcDob() {
        return cDob;
    }

    public void setcDob(Date cDob) {
        this.cDob = cDob;
    }

    @Override
    public String toString() {
        return "Customer { " +
                "cId= " + cId +
                ", cName= '" + cName + '\'' +
                ", cEmail= '" + cEmail + '\'' +
                ", cDob= " +  cDob.getDate() + "/" + cDob.getMonth() + "/" + cDob.getYear() +
                " }";
    }
}
