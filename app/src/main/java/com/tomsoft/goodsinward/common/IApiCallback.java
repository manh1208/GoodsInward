package com.tomsoft.goodsinward.common;

/********************************************************
 * File Name : IApiCallback.java
 * Author : ManhNV
 * Date : 2017-04-02
 * Description:
 * Last-modified by : ManhNV
 * Last-modified : 2017-04-02
 ********************************************************/


public interface IApiCallback<T> {
    void onSuccess(T result);

    void onError(String message);

    void onIntenetError();
}
