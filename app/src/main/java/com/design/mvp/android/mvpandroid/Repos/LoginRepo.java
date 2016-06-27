package com.design.mvp.android.mvpandroid.Repos;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by Peter-John on 2016-06-27.
 * MVPAndroid
 */
public class LoginRepo implements ILoginRepo {
    @Override
    public void login(String username, String password, OnLoginFinishedListener listener) {
        new Handler().postDelayed(() -> {
            boolean error = false;
            if (TextUtils.isEmpty(username)){
                listener.onUsernameError();
                error = true;
            }
            if (TextUtils.isEmpty(password)){
                listener.onPasswordError();
                error = true;
            }
            if (!error){
                listener.onSuccess();
            }
        }, 5000);
    }
}
