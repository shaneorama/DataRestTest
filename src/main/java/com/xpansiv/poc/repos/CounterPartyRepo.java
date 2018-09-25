package com.xpansiv.poc.repos;

import com.xpansiv.poc.entities.CounterParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CounterPartyRepo extends JpaRepository<CounterParty, Integer> {

}
