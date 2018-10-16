package com.xpansiv.poc.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "vw_upload")
public class Upload implements HackedId {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(insertable = false, updatable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date created;

  @Column(insertable = false, updatable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date updated;

  private int createUserId;
  private int updateUserId;

  private Integer counterPartyId;

  @Column(insertable = false, updatable = false)
  private String counterPartyCode;

  @Column(name="counter_party", insertable = false, updatable = false)
  private String counterPartyName;

  private String type;
  private String status;
  private String message;
  private String filename;

}
