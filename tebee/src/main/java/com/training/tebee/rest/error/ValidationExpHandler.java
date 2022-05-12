package com.training.tebee.rest.error;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class ValidationExpHandler implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(ConstraintViolationException exceptionParam) {
        ErrorObj rootErrorObjLoc = new ErrorObj(12001,
                                                "Validasyon problemi");
        Set<ConstraintViolation<?>> constraintViolationsLoc = exceptionParam.getConstraintViolations();
        for (ConstraintViolation<?> constraintViolationLoc : constraintViolationsLoc) {
            rootErrorObjLoc.addSubError(new ErrorObj(12003,
                                                     constraintViolationLoc.toString()));
        }
        return Response.status(Status.BAD_REQUEST)
                       .header("Content-Type",
                               MediaType.APPLICATION_JSON)
                       .entity(rootErrorObjLoc)
                       .build();
    }

}
