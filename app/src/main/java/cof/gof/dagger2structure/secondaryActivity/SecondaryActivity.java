package cof.gof.dagger2structure.secondaryActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import cof.gof.dagger2structure.R;
import cof.gof.dagger2structure.shared.Flumbolator;
import dagger.android.AndroidInjection;

public class SecondaryActivity extends AppCompatActivity {

    private static final String TAG = SecondaryActivity.class.getCanonicalName();
    @Inject
    Flumbolator flumbolator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Log.d(TAG, flumbolator.frumbolateMe());
    }
}
