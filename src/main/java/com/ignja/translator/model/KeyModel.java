package com.ignja.translator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "keys")
public class KeyModel extends AuditModel
{

  @Id
  @GeneratedValue(generator = "key_generator")
  @SequenceGenerator(
      name = "key_generator",
      sequenceName = "keys_id_seq",
      initialValue = 1000
  )
  private Long id;

  @Column(columnDefinition = "name")
  private String name;

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

}
