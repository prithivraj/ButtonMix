package com.zestworks.buttonmix.buttons;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zestworks.buttonmix.ButtonType;

public class YahooButton extends BaseButton {

    public YahooButton(@NonNull Context context) {
        super(context);
        setOrientation(LinearLayout.HORIZONTAL);
        Button button = addButton();
        addView(button);
        TextView textView = addTitleTextView();
        addView(textView);
    }

    public YahooButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public YahooButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    String getToastText() {
        return ButtonType.YAHOO.name();
    }
}
