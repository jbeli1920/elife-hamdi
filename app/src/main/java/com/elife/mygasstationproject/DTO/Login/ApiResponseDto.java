package com.elife.mygasstationproject.DTO.Login;

public class ApiResponseDto<T> {
    private T responseData;
    private String responseMessage;


    public ApiResponseDto(T responseData, String responseMessage) {
        this.responseData = responseData;
        this.responseMessage = responseMessage;
    }

    public T getResponseData() {
        return responseData;
    }

    public void setResponseData(T responseData) {
        this.responseData = responseData;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}