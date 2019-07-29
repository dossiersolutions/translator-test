package com.ignja.translator.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ignja.translator.Users;
import com.ignja.translator.model.LanguageModel;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "languages")
@Path("/languages")
public class LanguageController {

  @GET
  @Produces("application/json")
  public ArrayList<LanguageModel> getAllLanguages() {
    return new ArrayList<>();
  }

}
