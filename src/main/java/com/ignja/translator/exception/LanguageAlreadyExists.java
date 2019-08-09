package com.ignja.translator.exception;

import javax.ws.rs.ext.Provider;

import com.ignja.translator.model.LanguageModel;

@Provider
public class LanguageAlreadyExists extends Exception
{

  private LanguageModel language;

  public LanguageAlreadyExists(LanguageModel languageModel)
  {
    language = languageModel;
  }

  LanguageModel getLanguageModel()
  {
    return language;
  }

}
