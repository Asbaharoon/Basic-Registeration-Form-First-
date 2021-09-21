/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registerationform.model;

/**
 *
 * @author Ahsan
 */
public class User {

    private Integer userId;
    private String Name;
    private Integer age;
    private String City;
    private String email;
    private Long CNIC;
    private String address;

    public User(String Name, Integer age, String City, String email, Long CNIC, String address) {
       
        this.Name = Name;
        this.age = age;
        this.City = City;
        this.email = email;
        this.CNIC = CNIC;
        this.address = address;
    }

    public User() {
    }
    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCNIC() {
        return CNIC;
    }

    public void setCNIC(Long CNIC) {
        this.CNIC = CNIC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }   
}
