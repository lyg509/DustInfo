package com.example.dustinfo.finedust;

import com.example.dustinfo.model.FineDust;


public interface FineDustContract {
    interface View {
        void showFineDustResult(FineDust fineDust);

        void showLoadError(String message);

        void loadingStart();

        void loadingEnd();

        void reload(double lat, double lng);
    }

    interface UserActionsListener {
        void loadFineDustData();
    }
}
