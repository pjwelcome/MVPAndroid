package com.design.mvp.android.mvpandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.ProgressBar;

import com.design.mvp.android.mvpandroid.Interfaces.ILoginPresenter;
import com.design.mvp.android.mvpandroid.Presenters.LoginPresenter;
import com.design.mvp.android.mvpandroid.Views.LoginView;

/**
 * Created by Peter-John on 2016-06-27.
 * MVPAndroid
 */
public class LoginActivity extends AppCompatActivity implements LoginView{


    private AppCompatEditText emailTextView;
    private  AppCompatEditText PasswordTextView;
    private AppCompatButton LoginButton;
    private ProgressBar progressBar;
    private ILoginPresenter presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        SetUpViews();
        presenter = new LoginPresenter(this);
    }

    private void SetUpViews() {
        emailTextView = (AppCompatEditText)findViewById(R.id.EmailTextView);
        PasswordTextView = (AppCompatEditText)findViewById(R.id.PasswordTextView);
        LoginButton = (AppCompatButton)findViewById(R.id.LoginButton);
        progressBar = (ProgressBar)findViewById(R.id.progressLogin);
        LoginButton.setOnClickListener(view -> presenter.validateCredentials(emailTextView.getText().toString(), PasswordTextView.getText().toString()));
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        emailTextView.setError(getString(R.string.username_error));
    }

    @Override
    public void setPasswordError() {
        PasswordTextView.setError(getString(R.string.username_error));
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void RegisterUserWithFirebase() {
        //TODO: do some firebase register here.
    }
}
