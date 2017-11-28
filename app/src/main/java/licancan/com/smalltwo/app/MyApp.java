package licancan.com.smalltwo.app;

import android.app.Application;

import com.mob.MobApplication;
import com.mob.MobSDK;

/**
 * Created by robot on 2017/11/20.
 */

public class MyApp extends MobApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        // 通过代码注册你的AppKey和AppSecret
        MobSDK.init(this, "227c4b4c099c6", "f5bd1023bfda8b749b1fd67b2f755317");
    }
}
