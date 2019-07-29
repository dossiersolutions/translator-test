package com.ignja.translator.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "languages")
public class LanguageModel extends AuditModel {

  @Id
  @GeneratedValue(generator = "language_generator")
  @SequenceGenerator(
      name = "language_generator",
      sequenceName = "language_sequence",
      initialValue = 1000
  )
  private Long id;

  @Column(columnDefinition = "name")
  private String name;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "question_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JsonIgnore

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
