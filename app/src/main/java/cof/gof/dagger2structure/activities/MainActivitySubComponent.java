package cof.gof.dagger2structure.activities;

import cof.gof.dagger2structure.shared.Flumbolator;
import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = MainActivitySubComponent.MainActivitySubModule.class)
public interface MainActivitySubComponent extends AndroidInjector<MainActivity>{

    @Module
    class MainActivitySubModule {
        @Provides
        Flumbolator provideFlumbolator(){
            return new Flumbolator();
        }
    }

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
