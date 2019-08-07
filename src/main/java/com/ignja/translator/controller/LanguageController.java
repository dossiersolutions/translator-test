package com.ignja.translator.controller;

import java.util.List;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonView;
import com.ignja.translator.TranslatorApplicationView;
import com.ignja.translator.Users;
import com.ignja.translator.constraints.ApiPathConstraints;
import com.ignja.translator.model.LanguageModel;
import javax.ws.rs.core.MediaType;

import org.springframework.hateoas.ExposesResourceFor;
import com.ignja.translator.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(ApiPathConstraints.ROOT_PATH)
@ExposesResourceFor(LanguageModel.class)
@Produces(MediaType.APPLICATION_JSON)
@Path("/languages")
public class LanguageController {

  @Autowired
  private LanguageService languageService;

  @GET
  //@RequestMapping(value = ApiPathConstraints.LANGUAGES_PATH, method = RequestMethod.GET)
  public ResponseEntity<Object> getLanguages() {
    List<LanguageModel> languageModelList = languageService.getLanguages();
//    for (LanguageModel languageModel: languageModelList) {
//      languageModel.add(linkTo(methodOn(AlbumController.class).findAlbum(album.getAlbumId())).withSelfRel());
//    }
    return new ResponseEntity<>(languageModelList, HttpStatus.OK);
  }

}
