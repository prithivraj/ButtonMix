package com.zestworks.buttonmix;


import java.util.ArrayList;
import java.util.List;

import static com.zestworks.buttonmix.ButtonType.APPLE;
import static com.zestworks.buttonmix.ButtonType.GOOGLE;
import static com.zestworks.buttonmix.ButtonType.YAHOO;

public class ApiServiceImpl implements ApiService {

    @Override
    public List<ButtonType> getButtons() {
        ArrayList<ButtonType> objects = new ArrayList<>();
        objects.add(APPLE);
        objects.add(GOOGLE);
        objects.add(GOOGLE);
        objects.add(GOOGLE);
        objects.add(GOOGLE);
        objects.add(YAHOO);
        objects.add(GOOGLE);
        objects.add(YAHOO);
        objects.add(YAHOO);
        objects.add(YAHOO);
        objects.add(YAHOO);
        return objects;
    }

    @Override
    public int getSize() {
        return -1;
    }
}
