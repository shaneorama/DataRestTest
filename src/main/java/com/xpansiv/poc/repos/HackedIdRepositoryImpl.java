package com.xpansiv.poc.repos;

import com.xpansiv.poc.entities.HackedId;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class HackedIdRepositoryImpl implements HackedIdRepositoryCustom {
  @PersistenceContext
  EntityManager em;

  @Override
  @Transactional
  public <S extends HackedId> S save(S entity) {
    em.persist(entity);
//    em.refresh(entity);
    Query query = em.createQuery("SELECT @@identity as id");
    Integer id = (Integer)query.getSingleResult();
    entity.setId(id);
    return entity;
  }
}
