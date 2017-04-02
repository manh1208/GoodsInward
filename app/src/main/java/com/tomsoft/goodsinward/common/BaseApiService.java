package com.tomsoft.goodsinward.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/********************************************************
 * File Name : BaseApiService.java
 * Author : ManhNV
 * Date : 2017-04-02
 * Description:
 * Last-modified by : ManhNV
 * Last-modified : 2017-04-02
 ********************************************************/


public class BaseApiService {
    private Retrofit mRetrofit;

    /**
     * BaseApiService Constructor
     *
     * @param url url of api
     */
    protected BaseApiService(String url) {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);
        mRetrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(httpClient.build())
                .build();
    }
}
