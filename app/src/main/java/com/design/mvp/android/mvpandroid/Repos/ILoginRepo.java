package com.design.mvp.android.mvpandroid.Repos;

/**
 * Created by Peter-John on 2016-06-27.
 * MVPAndroid
 */
public interface ILoginRepo {

    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
