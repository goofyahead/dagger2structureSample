package cof.gof.dagger2structure;

import dagger.Component;
import dagger.Module;
import dagger.android.AndroidInjectionModule;

@Component(
        modules = {
                AndroidInjectionModule.class,
                TestBindingModule.class,
                TestApplicationComponent.TestAppModule.class
        })
interface TestApplicationComponent {

    void inject(TestApplication app);

    @Module
    class TestAppModule {
    }
}