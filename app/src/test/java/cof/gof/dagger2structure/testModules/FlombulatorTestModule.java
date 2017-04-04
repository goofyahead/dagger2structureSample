package cof.gof.dagger2structure.testModules;

import org.mockito.Mockito;

import cof.gof.dagger2structure.shared.Flumbolator;
import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.when;

@Module
public class FlombulatorTestModule {

    @Provides
    Flumbolator provideTestFlombulator() {
        System.out.println("I the mocked flumbolator have been summoned, behold my mock power");
        Flumbolator flum = Mockito.mock(Flumbolator.class);
        when(flum.frumbolateMe()).thenReturn("flumbolate test");
        return flum;
    }
}
