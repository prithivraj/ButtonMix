package com.zestworks.buttonmix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.zestworks.buttonmix.buttons.BaseButton;
import com.zestworks.buttonmix.buttons.ButtonFactory;

public class MainActivity extends AppCompatActivity implements ITalkToView {

    private MainPresenter presenter;
    private LinearLayout mainContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainContainer = findViewById(R.id.mainContainer);
        presenter = new MainPresenter(this, new ApiServiceImpl());
        presenter.loadButtons();
    }

    @Override
    public void renderButton(ButtonType button) {
        BaseButton buttonForType = ButtonFactory.getInstance().getButtonForType(getBaseContext(), button);
        mainContainer.addView(buttonForType);
    }
}