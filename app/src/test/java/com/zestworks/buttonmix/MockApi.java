package com.zestworks.buttonmix;


import java.util.ArrayList;
import java.util.List;

import static com.zestworks.buttonmix.ButtonType.APPLE;
import static com.zestworks.buttonmix.ButtonType.GOOGLE;
import static com.zestworks.buttonmix.ButtonType.YAHOO;

public class MockApi implements ApiService {

    private ArrayList<ButtonType> objects = new ArrayList<ButtonType>() {{
        add(GOOGLE);
        add(APPLE);
        add(APPLE);
        add(APPLE);
        add(APPLE);
        add(YAHOO);
    }};

    @Override
    public List<ButtonType> getButtons() {
        return objects;
    }

    @Override
    public int getSize() {
        return objects.size();
    }
}
