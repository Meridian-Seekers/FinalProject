package com.example.finalproject.interfaces;

import com.example.finalproject.models.DeleteAcc;
import com.example.finalproject.models.DeleteResponse;
import com.example.finalproject.models.EmailRequest;
import com.example.finalproject.models.LoginResponse;
import com.example.finalproject.models.LogoutRequest;
import com.example.finalproject.models.PasswordResetRequest;
import com.example.finalproject.models.PasswordResetResponse;
import com.example.finalproject.models.User;
import com.google.gson.JsonObject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiService {
    @POST("login")
    Call<LoginResponse> getLogin(@Body User user);

    @POST("signup")
    Call<LoginResponse> getSignup(@Body User user);
    @POST("logout")
    Call<DeleteResponse> getLogout(@Body LogoutRequest logoutRequest);
    @POST("profile/delete")
    Call<DeleteResponse> getDelete(@Body DeleteAcc deleteAcc);
    @PUT("profile")
    Call<LoginResponse> getUpdate(@Body User user);

    //newly added
    @POST("validate_email")
    Call<Void> validateEmail(@Body EmailRequest emailRequest);

    /*@POST("reset-password")
    Call<PasswordResetResponse> resetPassword(@Body PasswordResetRequest passwordResetRequest);*/

    @POST("password_reset")
    Call<PasswordResetResponse> resetPassword(@Body PasswordResetRequest passwordResetRequest);
}
