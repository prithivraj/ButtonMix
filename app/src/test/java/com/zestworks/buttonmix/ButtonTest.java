package com.zestworks.buttonmix;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ButtonTest {

    @Mock
    private
    ITalkToView iTalkToView;

    private ApiService mockApi;
    private MainPresenter mainPresenter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockApi = new MockApi();
        mainPresenter = new MainPresenter(iTalkToView, mockApi);
    }

    @Test
    public void number_of_buttons_test() throws Exception {
        mainPresenter.loadButtons();
        Mockito.verify(iTalkToView, Mockito.times(mockApi.getSize())).renderButton(Mockito.any(ButtonType.class));
    }
}