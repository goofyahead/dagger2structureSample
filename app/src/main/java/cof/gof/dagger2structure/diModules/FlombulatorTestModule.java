package cof.gof.dagger2structure.diModules;

import org.mockito.Mockito;

import cof.gof.dagger2structure.shared.Flumbolator;
import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.when;

@Module
public class FlombulatorTestModule {

    @Provides
    Flumbolator provideTestFlombulator() {
        Flumbolator flum = Mockito.mock(Flumbolator.class);
        when(flum.frumbolateMe()).thenReturn("Flumbolated test");
        return flum;
    }
}
