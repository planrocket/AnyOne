package com.example.demo.one;


/**
 * view、Presenter 不在继承BaseView、BasePresenter
 * 仅用来内部约束
 */
public interface OneContract {

    interface View {
        void onBtnClicked();
    }

    interface Presenter {
        void getData();
    }
}
