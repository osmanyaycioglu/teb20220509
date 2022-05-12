package com.training.tebee.rest.error;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class GeneralExpHandler implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exceptionParam) {
        if (exceptionParam instanceof NotFoundException) {
            return Response.status(Status.NOT_FOUND)
                           .header("Content-Type",
                                   MediaType.APPLICATION_JSON)
                           .entity(new ErrorObj(14004,
                                                exceptionParam.getMessage()))
                           .build();
        }
        exceptionParam.printStackTrace();
        return Response.status(Status.INTERNAL_SERVER_ERROR)
                       .header("Content-Type",
                               MediaType.APPLICATION_JSON)
                       .entity(new ErrorObj(15000,
                                            exceptionParam.getMessage()))
                       .build();
    }

}
