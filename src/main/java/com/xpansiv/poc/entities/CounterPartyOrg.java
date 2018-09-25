package com.xpansiv.poc.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class CounterPartyOrg {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;

  @OneToMany
  private List<CounterParty> counterParties;
}

