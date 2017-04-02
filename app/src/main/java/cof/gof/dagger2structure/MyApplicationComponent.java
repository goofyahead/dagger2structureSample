package cof.gof.dagger2structure;

import cof.gof.dagger2structure.activities.MainActivityModule;
import dagger.Component;
import dagger.Module;
import dagger.android.AndroidInjectionModule;

@Component(
        modules = {
                MainActivityModule.class,
                AndroidInjectionModule.class,
                MyApplicationComponent.AppModule.class
        })
interface MyApplicationComponent {

        void inject(Dagger2application dagger2application);

        @Module
        class AppModule {}
}
