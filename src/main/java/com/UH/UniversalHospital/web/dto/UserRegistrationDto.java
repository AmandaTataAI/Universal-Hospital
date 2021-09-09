package com.UH.UniversalHospital.web.dto;

import javax.persistence.Column;

public class UserRegistrationDto {
    private String fname;
    private String lname;
    private String phone;
    private String email;
    private String password;
    private String cpassword;
    private String address;
    private String hname;
    private String haddress;
    private String profession;
    private String years;

    public UserRegistrationDto() {
    }

    public UserRegistrationDto(String fname, String lname, String phone, String email, String password,
                               String cpassword, String address, String hname, String haddress, String profession, String years) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.cpassword = cpassword;
        this.address = address;
        this.hname = hname;
        this.haddress = haddress;
        this.profession = profession;
        this.years = years;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getHaddress() {
        return haddress;
    }

    public void setHaddress(String haddress) {
        this.haddress = haddress;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }
}
