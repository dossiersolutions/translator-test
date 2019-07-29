package com.ignja.translator;

import com.ignja.translator.controller.LanguageController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig
{
  public JerseyConfig()
  {
    register(UserResource.class);
    register(LanguageController.class);
  }
}
