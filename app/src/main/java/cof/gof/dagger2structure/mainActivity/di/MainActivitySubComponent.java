package cof.gof.dagger2structure.mainActivity.di;

import cof.gof.dagger2structure.diModules.FlombulatorModule;
import cof.gof.dagger2structure.mainActivity.MainActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {
        FlombulatorModule.class,
        MainActivitySubComponent.MainActivityModule.class
})
public interface MainActivitySubComponent extends AndroidInjector<MainActivity> {

    @Module
    class MainActivityModule {}

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
