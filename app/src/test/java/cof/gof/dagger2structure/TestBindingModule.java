package cof.gof.dagger2structure;

import android.app.Activity;

import cof.gof.dagger2structure.mainActivity.MainActivity;
import cof.gof.dagger2structure.mainActivity.di.TestMainActivitySubComponent;
import cof.gof.dagger2structure.secondaryActivity.SecondaryActivity;
import cof.gof.dagger2structure.secondaryActivity.di.SecondaryActivitySubComponent;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        TestMainActivitySubComponent.class,
        SecondaryActivitySubComponent.class
})
public abstract class TestBindingModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(TestMainActivitySubComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(SecondaryActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainSecondaryInjectorFactory(SecondaryActivitySubComponent.Builder builder);
}