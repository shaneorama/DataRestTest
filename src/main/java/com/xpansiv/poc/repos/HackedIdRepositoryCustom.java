package com.xpansiv.poc.repos;

import com.xpansiv.poc.entities.HackedId;

public interface HackedIdRepositoryCustom {
  <S extends HackedId> S save(S entity);
}
