package com.ignja.translator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "translations")
public class TranslationModel extends AuditModel {

  @Id
  @GeneratedValue(generator = "translation_generator")
  @SequenceGenerator(
      name = "translation_generator",
      sequenceName = "translation_sequence",
      initialValue = 1000
  )
  private Long id;

  @Column(name = "value")
  private String value;

  @Column(name = "key_id")
  private String key_id;

  @Column(name = "language_id")
  private String language_id;

  @Column(name = "version_id")
  private String version_id;


  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "key_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JsonIgnore
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}
