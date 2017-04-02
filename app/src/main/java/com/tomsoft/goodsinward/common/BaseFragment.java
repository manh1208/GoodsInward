package com.tomsoft.goodsinward.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/********************************************************
 * File Name : BaseFragment.java
 * Author : ManhNV
 * Date : 2017-04-02
 * Description: Base fragment
 * Last-modified by : ManhNV
 * Last-modified : 2017-04-02
 ********************************************************/


public abstract class BaseFragment extends Fragment implements IBaseView {

    /**
     * Android call back - Create view
     *
     * @param inflater           layout inflate
     * @param container          container
     * @param savedInstanceState instance state
     * @return view
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getResLayout(), container, false);
    }

    /**
     * Android callback
     *
     * @param view               view
     * @param savedInstanceState instance state
     */
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindingView();
        init();
    }

    /**
     * binding view from layout
     *
     * @param id  int of view
     * @param <T> View
     * @return view
     */
    protected <T extends View> T binding(int id) {
        return (T) getView().findViewById(id);
    }

    /**
     * Include binding all view
     */
    protected abstract void bindingView();

    /**
     * Init project
     */
    protected abstract void init();

    /**
     * Get layout of fragment
     *
     * @return id of layout
     */
    protected abstract int getResLayout();
}

