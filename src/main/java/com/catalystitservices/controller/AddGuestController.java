package com.catalystitservices.controller;

import javax.faces.bean.SessionScoped;
import javax.faces.event.NamedEvent;

import org.springframework.beans.factory.annotation.Autowired;

import com.catalystitservices.guest.dao.UserDao;
import com.catalystitservices.guest.model.User;

@NamedEvent
@SessionScoped
// TODO what are these?
public class AddGuestController {

  @Autowired
  private UserDao userDao;

  private String name;
  private String address;
  private String qty;
  private String email;

  public AddGuestController() {

  }



  public void addGuest() {

    User user = new User();

    user.setAddress(address);
    user.setEmail(email);
    user.setName(name);
    user.setQty(qty);
    userDao.persist(user);


  }


  public UserDao getUserDao() {
    return userDao;
  }

  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getQty() {
    return qty;
  }

  public void setQty(String qty) {
    this.qty = qty;
  }



  public String getEmail() {
    return email;
  }



  public void setEmail(String email) {
    this.email = email;
  }



}
