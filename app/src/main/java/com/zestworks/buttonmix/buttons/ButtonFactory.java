package com.zestworks.buttonmix.buttons;


import android.content.Context;

import com.zestworks.buttonmix.ButtonType;

public class ButtonFactory {
    private static final ButtonFactory ourInstance = new ButtonFactory();

    private ButtonFactory() {
    }

    public static ButtonFactory getInstance() {
        return ourInstance;
    }

    public BaseButton getButtonForType(Context context, ButtonType buttonType) {
        switch (buttonType) {
            case APPLE:
                return new AppleButton(context);
            case YAHOO:
                return new YahooButton(context);
            case GOOGLE:
                return new GoogleButton(context);
        }
        return null;
    }
}
