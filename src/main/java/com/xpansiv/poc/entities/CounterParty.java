package com.xpansiv.poc.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class CounterParty {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;

  @ManyToOne
  private CounterPartyOrg org;

  @OneToMany
  private List<Note> notes;
}
