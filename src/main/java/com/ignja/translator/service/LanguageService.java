package com.ignja.translator.service;

import java.util.List;

import com.ignja.translator.model.LanguageModel;
import com.ignja.translator.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class LanguageService {

  @Autowired
  LanguageRepository languageRepository;

//  LanguageModel createLanguage(LanguageModel languageModel) {
//
//  }
//
//  LanguageModel getLanguage(Long id) {
//  }

  public List<LanguageModel> getLanguages() {
    return languageRepository.findAll();
  }
}