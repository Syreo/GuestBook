package com.catalystitservices.guest.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.catalystitservices.guest.dao.UserDao;
import com.catalystitservices.guest.model.User;

@Component
public class UserDaoImpl implements UserDao {

  @PersistenceContext(unitName = "GuestBookPU")
  // TODO what does this do?
  private EntityManager em;


  /**
   * sets the entity manager
   * 
   * @param em
   */
  public void setEm(EntityManager em) {
    this.em = em;
  }

  /**
   * persists a user
   * 
   * @param user
   */
  @Transactional
  public void persist(User user) {
    em.persist(user);
  }



}
