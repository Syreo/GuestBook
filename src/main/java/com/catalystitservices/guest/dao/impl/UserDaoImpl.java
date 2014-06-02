package com.catalystitservices.guest.dao.impl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.transaction.annotation.Transactional;

import com.catalystitservices.guest.dao.UserDao;
import com.catalystitservices.guest.model.User;

//@Component("userDao")
//@ManagedBean(name="userDao")
//@ViewScoped
//@Transactional
public class UserDaoImpl implements UserDao {

	// TODO what does this do?
  @PersistenceContext(unitName = "GuestBookPU", type=PersistenceContextType.EXTENDED)
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

/**
 * @return the em
 */
public EntityManager getEm() {
	return em;
}



}
