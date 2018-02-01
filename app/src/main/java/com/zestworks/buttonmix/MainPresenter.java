package com.zestworks.buttonmix;


import java.util.List;

class MainPresenter {
    private ITalkToView iTalkToView;
    private ApiService apiService;

    MainPresenter(ITalkToView iTalkToView, ApiService apiService) {
        this.iTalkToView = iTalkToView;
        this.apiService = apiService;
    }

    void loadButtons() {
        List<ButtonType> buttons = apiService.getButtons();
        for (ButtonType button : buttons) {
            iTalkToView.renderButton(button);
        }
    }
}
