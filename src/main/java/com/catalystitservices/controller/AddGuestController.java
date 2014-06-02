package com.catalystitservices.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.catalystitservices.guest.model.User;
import com.catalystitservices.service.UserService;
//TODO what are these?

//@ManagedBean(name="addGuestController")
//@RequestScoped
@Named("addGuestController")
//@ViewScoped
//@Component("addGuestController")
//@Scope("request")
public class AddGuestController implements Serializable{

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

  //@Inject
  //@ManagedProperty(value = "#{UserService}")
  @Autowired
  private UserService userService;

  private String name;
  private String address;
  private String qty;
  private String email;



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



	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public String getEmail() {
	    return email;
	  }

  public void addGuest() {

    User user = new User();

    user.setAddress(address);
    user.setEmail(email);
    user.setName(name);
    user.setQty(qty);
    userService.addGuest(user);

  }

/**
 * @return the userService
 */
public UserService getUserService() {
	return userService;
}

/**
 * @param userService the userService to set
 */
public void setUserService(UserService userService) {
	this.userService = userService;
}

/**
 * @return the serialversionuid
 */
public static long getSerialversionuid() {
	return serialVersionUID;
}


  





}
