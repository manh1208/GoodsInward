package com.tomsoft.goodsinward.common;

/********************************************************
 * File Name : BasePresenter.java
 * Author : ManhNV
 * Date : 2017-04-02
 * Description: Base Presenter
 * Last-modified by : ManhNV
 * Last-modified : 2017-04-02
 ********************************************************/


public class BasePresenter<T extends IBaseView> implements IPresenter<T> {
    private T mView;

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }

    @Override
    public T getview() {
        return this.mView;
    }
}
