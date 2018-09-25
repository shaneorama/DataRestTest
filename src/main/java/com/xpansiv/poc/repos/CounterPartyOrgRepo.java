package com.xpansiv.poc.repos;

import com.xpansiv.poc.entities.CounterPartyOrg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CounterPartyOrgRepo extends JpaRepository<CounterPartyOrg, Integer> {

}
