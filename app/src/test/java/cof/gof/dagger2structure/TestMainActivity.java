package cof.gof.dagger2structure;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import cof.gof.dagger2structure.mainActivity.MainActivity;

import static junit.framework.Assert.assertEquals;

@Config(constants = BuildConfig.class, sdk = 21, application = Dagger2application.class)
@RunWith(RobolectricTestRunner.class)
public class TestMainActivity {

    private MainActivity mainActivity;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void addition_isCorrect() throws Exception {
        mainActivity = Robolectric.buildActivity(MainActivity.class).create().visible().get();
        assertEquals(4, 2 + 2);
    }

}
