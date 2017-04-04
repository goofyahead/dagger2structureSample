package cof.gof.dagger2structure.mainActivity.di;

import cof.gof.dagger2structure.mainActivity.MainActivity;
import cof.gof.dagger2structure.testModules.FlombulatorTestModule;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {
        FlombulatorTestModule.class,
        TestMainActivitySubComponent.MainActivityModule.class
})
public interface TestMainActivitySubComponent extends AndroidInjector<MainActivity> {

    @Module
    class MainActivityModule {}

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
