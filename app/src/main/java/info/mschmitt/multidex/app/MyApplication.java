package info.mschmitt.multidex.app;

import android.content.Context;

import androidx.collection.ArraySet;
import androidx.multidex.MultiDexApplication;

import com.google.gson.Gson;

/**
 * @author Matthias Schmitt
 */
public class MyApplication extends MultiDexApplication {
    public Gson gson;
    public ArraySet<Integer> set;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        gson = new Gson(); // This works without another indirection
        Indirections.initialize(this);
    }

    private static class Indirections {
        static void initialize(MyApplication application) {
            application.set = new ArraySet<>(); // This only works embedded inside a different class
        }
    }
}
