package info.mschmitt.multidex.app;

import androidx.collection.ArraySet;
import androidx.multidex.MultiDexApplication;

import com.google.gson.Gson;

/**
 * @author Matthias Schmitt
 */
public class MyApplication extends MultiDexApplication {
//    public Gson gson = new Gson();
    public ArraySet<Integer> set = new ArraySet<>();
}
