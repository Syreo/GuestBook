package com.catalystitservices.guest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "guest_roster")
public class User {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Column(name = "guest_name")
  private String name;
  @Column(name = "guest_email")
  private String email;
  @Column(name = "guest_address")
  private String address;
  @Column(name = "guest_quantity")
  private String qty;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    StringBuffer strBuff = new StringBuffer();
    strBuff.append("id : ").append(id);
    strBuff.append(", name : ").append(name);
    strBuff.append(",email : ").append(email);
    strBuff.append(",address : ").append(address);
    strBuff.append(",qty : ").append(qty);
    return strBuff.toString();
  }

  public String getQty() {
    return qty;
  }

  public void setQty(String qty) {
    this.qty = qty;
  }
}
