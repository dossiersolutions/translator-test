package com.ignja.translator.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ignja.translator.model.TranslationModel;
import com.ignja.translator.repository.TranslationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExposesResourceFor(TranslationModel.class)
@Produces(MediaType.APPLICATION_JSON)
@Path("/translations")
public class TranslationsController {

  @Autowired
  private TranslationsRepository translationsRepository;

  @GET
  public ResponseEntity<Object> getAll() {
    List<TranslationModel> translationModelList = translationsRepository.findAll();
    return new ResponseEntity<>(translationModelList, HttpStatus.OK);
  }

}
