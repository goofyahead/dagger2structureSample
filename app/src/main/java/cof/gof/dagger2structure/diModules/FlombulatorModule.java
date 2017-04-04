package cof.gof.dagger2structure.diModules;

import cof.gof.dagger2structure.shared.Flumbolator;
import dagger.Module;
import dagger.Provides;

@Module
public class FlombulatorModule {

    @Provides
    Flumbolator provideFlumBolator() {
        System.out.println("I'm the mighty real implementation, give me a break");
        return new Flumbolator();
    }
}
