package com.design.mvp.android.mvpandroid.Presenters;

import com.design.mvp.android.mvpandroid.Interfaces.ILoginPresenter;
import com.design.mvp.android.mvpandroid.Repos.ILoginRepo;
import com.design.mvp.android.mvpandroid.Repos.LoginRepo;
import com.design.mvp.android.mvpandroid.Views.LoginView;

/**
 * Created by Peter-John on 2016-06-27.
 * MVPAndroid
 */
public class LoginPresenter implements ILoginPresenter, ILoginRepo.OnLoginFinishedListener {

    private LoginView loginView;
    private ILoginRepo loginRepo;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        this.loginRepo = new LoginRepo();
    }

    @Override

    public void validateCredentials(String username, String password) {
        if (loginView != null) {
            loginView.showProgress();
        }

        loginRepo.login(username, password, this);
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void onUsernameError() {
        if (loginView != null) {
            loginView.setUsernameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (loginView != null) {
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.navigateToHome();
        }
    }
}
