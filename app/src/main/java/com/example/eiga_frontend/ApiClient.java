package com.example.eiga_frontend;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit getRetrofit(){
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("http://192.168.0.9:3000/v1/").client(okHttpClient).build();

        return retrofit;
    }

    public static UserService getService(){
        UserService userService = getRetrofit().create(UserService.class);
        return userService;
    }
}
