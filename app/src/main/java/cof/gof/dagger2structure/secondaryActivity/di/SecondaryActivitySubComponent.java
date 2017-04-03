package cof.gof.dagger2structure.secondaryActivity.di;

import cof.gof.dagger2structure.diModules.FlombulatorModule;
import cof.gof.dagger2structure.secondaryActivity.SecondaryActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {
        FlombulatorModule.class,
        SecondaryActivitySubComponent.SecondaryActivityModule.class
})
public interface SecondaryActivitySubComponent extends AndroidInjector<SecondaryActivity> {

    @Module
    class SecondaryActivityModule {}

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SecondaryActivity> {}
}
