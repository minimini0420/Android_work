package com.aijava.android_workspace.api;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrolfitClient {
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if(retrofit==null){
            final String BASE_URL = "http://api.apenweathermap.org/data/2.5/"; // 서버 베이스 주소를 적어라
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
