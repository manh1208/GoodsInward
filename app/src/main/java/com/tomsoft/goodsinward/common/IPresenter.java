package com.tomsoft.goodsinward.common;

/********************************************************
 * File Name : IPresenter.java
 * Author : ManhNV
 * Date : 2017-04-02
 * Description: Interface of presenter
 * Last-modified by : ManhNV
 * Last-modified : 2017-04-02
 ********************************************************/

public interface IPresenter<T extends IBaseView> {

    /**
     * attach view to presenter
     *
     * @param view view
     */
    void attachView(T view);

    /**
     * detach view when destroy view
     */
    void detachView();

    /**
     * get view
     *
     * @return view
     */
    T getview();
}
