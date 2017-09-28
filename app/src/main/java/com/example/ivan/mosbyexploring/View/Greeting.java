package com.example.ivan.mosbyexploring.View;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by ivan on 28.09.17.
 */

public interface Greeting extends MvpView {
    void showHello(String hello);
    void showGoodbye(String goodbye);
}
