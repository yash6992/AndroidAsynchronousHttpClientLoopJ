package truemd.com.androidasynchronoushttpclientloopj.activity;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by yashvardhansrivastava on 22/10/16.
 */
public class ExampleApplication extends Application {

    @Override public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        // Normal app init code...
    }
}