package com.design.mvp.android.mvpandroid.Presenters;

import com.design.mvp.android.mvpandroid.Interfaces.IMainPresenter;
import com.design.mvp.android.mvpandroid.Views.MainView;

/**
 * Created by Peter-John on 2016-06-27.
 * MVPAndroid
 */
public class MainPresenter implements IMainPresenter {

    private MainView mainView;
    @Override
    public void onResume() {
        if (mainView != null) {
            mainView.showProgress();
        }
    }

    @Override
    public void onItemClicked(int position) {
        if (mainView != null) {
            mainView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void hideProgress() {
        mainView.hideProgress();
    }
}
