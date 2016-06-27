package com.design.mvp.android.mvpandroid.Interfaces;

/**
 * Created by Peter-John on 2016-06-27.
 * MVPAndroid
 */
public interface IMainPresenter {
    void onResume();

    void onItemClicked(int position);

    void onDestroy();

    void hideProgress();
}
