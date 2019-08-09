package com.ignja.translator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.ignja.translator.controller.KeysController;
import com.ignja.translator.controller.LanguageController;
import com.ignja.translator.controller.TranslationsController;
import com.ignja.translator.exception.LanguageAlreadyExistsExceptionMapper;
import com.ignja.translator.exception.UncaughtException;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig
{
  public JerseyConfig()
  {
    register(UserResource.class);
    register(LanguageController.class);
    register(UncaughtException.class);
    register(LanguageAlreadyExistsExceptionMapper.class);
    register(KeysController.class);
    register(TranslationsController.class);
  }
}
