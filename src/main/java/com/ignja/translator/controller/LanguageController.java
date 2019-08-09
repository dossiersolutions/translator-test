package com.ignja.translator.controller;

import java.util.List;

import com.ignja.translator.exception.NotExistingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.ignja.translator.exception.LanguageAlreadyExists;
import com.ignja.translator.model.LanguageModel;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ignja.translator.repository.LanguageRepository;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExposesResourceFor(LanguageModel.class)
@Produces(MediaType.APPLICATION_JSON)
@Path("/languages")
public class LanguageController
{

  private static final Logger logger = LoggerFactory.getLogger(LanguageController.class);

  @Autowired
  private LanguageRepository languageRepository;

  @GET
  public ResponseEntity<Object> getLanguages()
  {
    List<LanguageModel> languageModelList = languageRepository.findAll();
    return new ResponseEntity<>(languageModelList, HttpStatus.OK);
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{id}")
  public Response getLanguage(@PathParam("id") Long id) throws NotExistingException
  {
    logger.info("Get language " + id);
    LanguageModel languageModel = languageRepository.findById(id)
        .orElseThrow(NotExistingException::new);
    logger.info("Language name: " + languageModel.getName());
    return Response
        .status(Response.Status.CREATED.getStatusCode())
        .entity(languageModel)
        .type(MediaType.APPLICATION_JSON)
        .build();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response addLanguage(LanguageModel languageModel) throws LanguageAlreadyExists
  {
    logger.info("Adding language: " + languageModel.getName());

    try {
      languageRepository.save(languageModel);
    } catch (Exception e) {
      logger.error("Saving language failed:" + languageModel.getName());
      throw new LanguageAlreadyExists(languageModel);
    }

    return Response
        .status(Response.Status.CREATED.getStatusCode())
        .entity(languageModel)
        .type(MediaType.APPLICATION_JSON)
        .build();
  }

}
