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
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "translations")
public class TranslationModel extends AuditModel
{

  @Id
  @GeneratedValue(generator = "translation_generator")
  @SequenceGenerator(
      name = "translation_generator",
      sequenceName = "translations_id_seq",
      initialValue = 1000
  )
  private Long id;

  @Column(name = "value")
  private String value;

  @ManyToOne(targetEntity = KeyModel.class, fetch = FetchType.EAGER)
  @JoinColumn(name = "key_id", nullable = false)
  @JsonManagedReference
  private KeyModel key;

  @ManyToOne(targetEntity = LanguageModel.class, fetch = FetchType.EAGER)
  @JoinColumn(name = "language_id", nullable = false)
  @JsonManagedReference
  private LanguageModel language;

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getValue()
  {
    return value;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public KeyModel getKey()
  {
    return key;
  }

  public void setKey(KeyModel key)
  {
    this.key = key;
  }

  public LanguageModel getLanguage()
  {
    return language;
  }

  public void setLanguage(LanguageModel language)
  {
    this.language = language;
  }

}
