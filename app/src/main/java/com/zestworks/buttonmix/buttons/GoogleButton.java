package com.zestworks.buttonmix.buttons;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zestworks.buttonmix.ButtonType;

public class GoogleButton extends BaseButton {

    public GoogleButton(@NonNull Context context) {
        super(context);
        setOrientation(LinearLayout.HORIZONTAL);
        TextView textView = addTitleTextView();
        addView(textView);
        Button button = addButton();
        addView(button);
    }

    public GoogleButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GoogleButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    String getToastText() {
        return ButtonType.GOOGLE.name();
    }
}
