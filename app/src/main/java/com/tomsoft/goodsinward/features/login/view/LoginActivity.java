package com.tomsoft.goodsinward.features.login.view;

import android.os.Bundle;

import com.tomsoft.goodsinward.R;
import com.tomsoft.goodsinward.common.BaseActivity;
import com.tomsoft.goodsinward.features.login.presenter.LoginPresenter;

/********************************************************
 * File Name : LoginActivity.java
 * Author : ManhNV
 * Date : 2017-04-02
 * Description: LoginActivity
 * Last-modified by : ManhNV
 * Last-modified : 2017-04-02
 ********************************************************/

public class LoginActivity extends BaseActivity implements LoginView {
    private LoginPresenter loginPresenter;

    /**
     * Android callback
     *
     * @param savedInstanceState instance state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void bindingView() {

    }

    @Override
    protected void init() {
        loginPresenter = new LoginPresenter();
        loginPresenter.attachView(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        loginPresenter.attachView(this);
    }

    @Override
    protected int getResLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.detachView();
    }
}