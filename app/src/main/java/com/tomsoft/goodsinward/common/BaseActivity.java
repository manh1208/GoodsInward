package com.tomsoft.goodsinward.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/********************************************************
 * File Name : BaseActivity.java
 * Author : ManhNV
 * Date : 2017-04-02
 * Description: Base Activity
 * Last-modified by : ManhNV
 * Last-modified : 2017-04-02
 ********************************************************/

public abstract class BaseActivity extends AppCompatActivity implements IBaseView {

    /**
     * Android callback
     *
     * @param savedInstanceState instance state
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResLayout());
        bindingView();
        init();
    }

    protected <T extends View> T binding(int id) {
        return (T) findViewById(id);
    }

    /**
     * Binding view into object
     */
    protected abstract void bindingView();

    /**
     * Init object
     */
    protected abstract void init();


    /**
     * Get layout of Activity
     *
     * @return id of layout
     */
    protected abstract int getResLayout();


}
