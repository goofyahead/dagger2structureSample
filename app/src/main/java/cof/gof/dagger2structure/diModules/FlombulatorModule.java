package cof.gof.dagger2structure.diModules;

import cof.gof.dagger2structure.shared.Flumbolator;
import dagger.Module;
import dagger.Provides;

@Module
public class FlombulatorModule {

    @Provides
    Flumbolator provideFlumBolator() {
        return new Flumbolator();
    }
}
