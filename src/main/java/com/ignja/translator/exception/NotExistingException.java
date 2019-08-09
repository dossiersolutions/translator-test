package com.ignja.translator.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NotExistingException extends Exception implements ExceptionMapper<Throwable>
{

  private static final long serialVersionUID = 1L;

  @Override
  public Response toResponse(Throwable exception)
  {
    return Response.status(404).entity("Not existing").type(MediaType.APPLICATION_JSON).build();
  }

}
