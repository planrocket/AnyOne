package com.example.demo.one;


public interface OneContract {

    interface View {
        void onBtnClicked();
    }

    interface Presenter {
        void getData();
    }
}
