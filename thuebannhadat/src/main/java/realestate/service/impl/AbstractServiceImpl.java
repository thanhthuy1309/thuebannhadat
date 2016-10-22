/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.service.impl;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import realestate.dao.AbstractDao;
import realestate.dao.impl.AbstractDaoImpl;
import realestate.service.AbstractService;

/**
 * @author : DUNGPT
 * @PG_ID : AbstractServiceImpl
 * @createDate : 21.10.2016
 */
@Service
public class AbstractServiceImpl<T, PK extends Serializable> implements AbstractService<T, PK> {

  /** Init logger. */
  private Logger logger = LoggerFactory.getLogger(AbstractServiceImpl.class);

  private AbstractDao<T, PK> abstractDao;

  public AbstractServiceImpl(AbstractDao<T, PK> abstractDao) {
    this.abstractDao = abstractDao;
  }

  public AbstractServiceImpl() {
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
  public T findByPK(PK id) {
    return abstractDao.findByPK(id);
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
  public List<T> findAll() {
    return abstractDao.findAll();
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
  public List<T> findAllByStatusOff() {
    return abstractDao.findAllByStatus(0);
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public T saveOrUpdate(T entity) {
    return abstractDao.saveOrUpdate(entity);
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public boolean persist(T entity) {
    return abstractDao.persist(entity);
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public T merge(T entity) {
    return abstractDao.merge(entity);
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public Integer save(T entity) {
    return abstractDao.save(entity);
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public boolean update(T entity) {
    return abstractDao.update(entity);
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public boolean deleteAll() {
    return abstractDao.deleteAll();
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public boolean delete(T entity) {
    return abstractDao.delete(entity);
  }
}
