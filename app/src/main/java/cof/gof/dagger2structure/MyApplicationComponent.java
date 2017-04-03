package cof.gof.dagger2structure;

import dagger.Component;
import dagger.Module;
import dagger.android.AndroidInjectionModule;

@Component(
        modules = {
                AndroidInjectionModule.class,
                BindingModule.class,
                MyApplicationComponent.AppModule.class
        })
interface MyApplicationComponent {

    void inject(Dagger2application dagger2application);

    @Module
    class AppModule {
    }
}
