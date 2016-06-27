package com.design.mvp.android.mvpandroid.Interfaces;

/**
 * Created by Peter-John on 2016-06-27.
 * MVPAndroid
 */
public interface ILoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
