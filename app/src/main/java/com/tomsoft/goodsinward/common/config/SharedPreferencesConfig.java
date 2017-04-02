package com.tomsoft.goodsinward.common.config;

import android.content.Context;
import android.content.SharedPreferences;

import com.tomsoft.goodsinward.common.constant.SharedPreferencesKey;

/********************************************************
 * File Name : SharedPreferencesConfig.java
 * Author : ManhNV
 * Date : 2017-04-02
 * Description:
 * Last-modified by : ManhNV
 * Last-modified : 2017-04-02
 ********************************************************/


public class SharedPreferencesConfig {
    private static SharedPreferencesConfig INSTANCE = null;
    private SharedPreferences mSharedPreferences;

    private SharedPreferencesConfig(Context context) {
        mSharedPreferences = context.getSharedPreferences(SharedPreferencesKey.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public static SharedPreferencesConfig getINSTANCE(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new SharedPreferencesConfig(context);
        }
        return INSTANCE;
    }

    public SharedPreferences getSharedPreferences() {
        return mSharedPreferences;
    }
}
