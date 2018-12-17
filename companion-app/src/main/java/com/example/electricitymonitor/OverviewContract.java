package com.example.electricitymonitor;


public interface OverviewContract {

    interface View {

        void showLoading();

        void hideLoading();

        void updateViewModel(ElectricityViewModel electricityViewModel);
    }

    interface Presenter {
        void attach(View view);

        void detach();

        void loadPowerInformation();
    }
}
