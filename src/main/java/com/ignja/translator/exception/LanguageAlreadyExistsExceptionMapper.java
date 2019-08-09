package com.ignja.translator.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class LanguageAlreadyExistsExceptionMapper implements ExceptionMapper<LanguageAlreadyExists>
{

  public Response toResponse(LanguageAlreadyExists ex)
  {
    return Response
        .status(Response.Status.CONFLICT.getStatusCode())
        .type(MediaType.APPLICATION_JSON)
        .entity(ex.getLanguageModel())
        .build();
  }

}
