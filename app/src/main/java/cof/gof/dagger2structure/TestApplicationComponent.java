package cof.gof.dagger2structure;

import android.app.Application;

import cof.gof.dagger2structure.diModules.FlombulatorTestModule;
import dagger.Component;
import dagger.Module;
import dagger.android.AndroidInjectionModule;

@Component(
        modules = {
                AndroidInjectionModule.class,
                FlombulatorTestModule.class,
                TestApplicationComponent.TestAppModule.class
        })
interface TestApplicationComponent {

    void inject(Application dagger2application);

    @Module
    class TestAppModule {
    }
}