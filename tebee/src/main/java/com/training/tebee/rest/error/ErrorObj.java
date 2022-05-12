package com.training.tebee.rest.error;

import java.util.ArrayList;
import java.util.List;

public class ErrorObj {

    private List<ErrorObj> subErrors;
    private Integer        errorCode;
    private String         errorDesc;


    public ErrorObj() {
    }

    public ErrorObj(Integer errorCodeParam,
                    String errorDescParam) {
        super();
        errorCode = errorCodeParam;
        errorDesc = errorDescParam;
    }

    public void addSubError(ErrorObj errorObjParam) {
        if (subErrors == null) {
            subErrors = new ArrayList<>();
        }
        subErrors.add(errorObjParam);
    }

    public List<ErrorObj> getSubErrors() {
        return subErrors;
    }

    public void setSubErrors(List<ErrorObj> subErrorsParam) {
        subErrors = subErrorsParam;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCodeParam) {
        errorCode = errorCodeParam;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDescParam) {
        errorDesc = errorDescParam;
    }


}
