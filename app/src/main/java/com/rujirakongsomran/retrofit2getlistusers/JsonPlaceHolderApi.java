package com.rujirakongsomran.retrofit2getlistusers;

import com.rujirakongsomran.retrofit2getlistusers.Model.Users;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("/api/users?page=2")
    Call<Users> getListUsers();
}
