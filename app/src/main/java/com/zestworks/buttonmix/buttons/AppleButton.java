package com.zestworks.buttonmix.buttons;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zestworks.buttonmix.ButtonType;

public class AppleButton extends BaseButton {

    public AppleButton(@NonNull Context context) {
        super(context);
        setOrientation(LinearLayout.VERTICAL);
        TextView textView = addTitleTextView();
        textView.setGravity(Gravity.CENTER);
        addView(textView);
        Button button = addButton();
        addView(button);
    }

    public AppleButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AppleButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    String getToastText() {
        return ButtonType.APPLE.name();
    }
}
