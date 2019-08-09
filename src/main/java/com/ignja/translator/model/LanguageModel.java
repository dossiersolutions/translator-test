package com.ignja.translator.model;

import javax.persistence.*;

@Entity
@Table(name = "languages")
public class LanguageModel extends AuditModel
{

  @Id
  @GeneratedValue(generator = "language_generator")
  @SequenceGenerator(
      name = "language_generator",
      sequenceName = "languages_id_seq",
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
