package com.zestworks.buttonmix.buttons;


import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.zestworks.buttonmix.R;

public abstract class BaseButton extends LinearLayout {


    public BaseButton(@NonNull Context context) {
        super(context);
        LayoutParams params = new LayoutParams(
                500,
                300
        );
        params.setMargins(30, 30, 30, 30);
        setLayoutParams(params);
        setGravity(Gravity.CENTER);
        setBackgroundColor(Color.WHITE);
        setElevation(10);
    }

    public BaseButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    abstract String getToastText();

    TextView addTitleTextView() {
        TextView text = new TextView(getContext());
        text.setTypeface(Typeface.DEFAULT_BOLD);
        text.setText(getToastText());
        return text;
    }

    Button addButton() {
        Button button = new Button(getContext());
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), getToastText(), Toast.LENGTH_SHORT).show();
            }
        });
        button.setText(R.string.button_text);
        button.setBackgroundColor(Color.parseColor("#303F9F"));
        button.setTextColor(Color.WHITE);
        button.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return button;
    }
}
