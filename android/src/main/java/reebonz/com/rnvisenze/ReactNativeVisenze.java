package reebonz.com.rnvisenze;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ReactNativeVisenze extends ReactContextBaseJavaModule {
    final static String ModuleName = "RNVisenze";

    public ReactNativeVisenze(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return ModuleName;
    }

    @ReactMethod
    public void test() {
        Log.d(ModuleName, "ReactNativeVisenze.test is called");
        return;
    }
}
