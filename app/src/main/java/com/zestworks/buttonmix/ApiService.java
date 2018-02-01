package com.zestworks.buttonmix;


import android.support.annotation.VisibleForTesting;

import java.util.List;

interface ApiService {
    List<ButtonType> getButtons();

    @VisibleForTesting
    int getSize();
}
