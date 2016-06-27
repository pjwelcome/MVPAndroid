package com.design.mvp.android.mvpandroid.Views;

/**
 * Created by Peter-John on 2016-06-27.
 * MVPAndroid
 */
public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
