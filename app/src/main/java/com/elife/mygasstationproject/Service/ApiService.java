package com.elife.mygasstationproject.Service;

import com.elife.mygasstationproject.DTO.Login.ApiResponseDto;
import com.elife.mygasstationproject.DTO.Login.VerifyEmployeeDto;
import com.elife.mygasstationproject.DTO.Login.LoginDto;
import com.elife.mygasstationproject.DTO.Login.LoginResponseDto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("login")
    Call<LoginResponseDto> login(@Body LoginDto loginDto);


    @POST("/send-email")
    Call<ApiResponseDto<String>>sendEmail(@Body VerifyEmployeeDto verifyEmployeeDto);
}
