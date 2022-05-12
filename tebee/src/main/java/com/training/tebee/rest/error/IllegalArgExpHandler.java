package com.training.tebee.rest.error;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class IllegalArgExpHandler implements ExceptionMapper<IllegalArgumentException> {

    @Override
    public Response toResponse(IllegalArgumentException exceptionParam) {

        return Response.status(Status.BAD_REQUEST)
                       .header("Content-Type",
                               MediaType.APPLICATION_JSON)
                       .entity(new ErrorObj(10001,
                                            exceptionParam.getMessage()))
                       .build();
    }

}
