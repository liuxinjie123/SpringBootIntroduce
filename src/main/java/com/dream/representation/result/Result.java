package com.dream.representation.result;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result implements Serializable {
    public boolean success;
    public String error;
    public Integer errorCode;
    private Map<String, Object> data;

    public Result setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public Result setError(String error) {
        this.error = error;
        return this;
    }

    public Result setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Result putData(String name, Object object) {
        if(data == null){ data = new HashMap<>(); }
        this.data.put(name, object);
        return this;
    }

    public static Result success(){
        return new  Result().setSuccess(true);
    }

    public static Result error(String error){
        return new  Result().setSuccess(false).setError(error).setErrorCode(10000);
    }

    public static Result error(String error, Integer errorCode) {
        return new Result().setSuccess(false).setError(error).setErrorCode(errorCode);
    }
}
