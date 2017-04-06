package cof.gof.dagger2structure.mainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import cof.gof.dagger2structure.BuildConfig;
import cof.gof.dagger2structure.TestApplication;

import static junit.framework.Assert.assertEquals;

@Config(constants = BuildConfig.class, sdk = 21, application = TestApplication.class)
@RunWith(RobolectricTestRunner.class)
public class TestMainActivity {

    private MainActivity mainActivity;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void addition_isCorrect() throws Exception {
        mainActivity = Robolectric.buildActivity(MainActivity.class).create().visible().get();
        assertEquals("flumbolate test", mainActivity.flumbolate());
    }

}
