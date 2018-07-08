package com.probe31.probe.bankingappv6.webservices;

import com.probe31.probe.bankingappv6.models.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Webservice {

    @GET("/users/{user}")
    Call<User> getUser(@Path("user") String userId);

}
