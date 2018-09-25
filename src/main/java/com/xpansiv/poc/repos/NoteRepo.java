package com.xpansiv.poc.repos;

import com.xpansiv.poc.entities.CounterParty;
import com.xpansiv.poc.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NoteRepo extends JpaRepository<Note, Integer> {

}
