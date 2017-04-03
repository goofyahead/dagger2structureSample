package cof.gof.dagger2structure;

public class TestApplication extends Dagger2application {

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("HEY IM UP TESTING APPLICATION COMPONENT ==========================+>");
        DaggerTestApplicationComponent.create().inject(this);
    }
}
