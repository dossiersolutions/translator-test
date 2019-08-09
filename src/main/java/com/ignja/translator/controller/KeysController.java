package com.ignja.translator.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ignja.translator.model.KeyModel;
import com.ignja.translator.repository.KeysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExposesResourceFor(KeyModel.class)
@Produces(MediaType.APPLICATION_JSON)
@Path("/keys")
public class KeysController
{

  @Autowired
  private KeysRepository keysRepository;

  @GET
  public ResponseEntity<Object> findAll()
  {
    List<KeyModel> keyModelList = keysRepository.findAll();
    return new ResponseEntity<>(keyModelList, HttpStatus.OK);
  }

}
