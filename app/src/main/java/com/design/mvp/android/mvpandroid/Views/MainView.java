package com.design.mvp.android.mvpandroid.Views;

import java.util.List;

/**
 * Created by Peter-John on 2016-06-27.
 * MVPAndroid
 */
public interface MainView {
    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
