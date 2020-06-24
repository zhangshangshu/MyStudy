package com.zss.mystudy;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zss.lib_common.base.BaseApplication;

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

          //  ARouter.openLog();
           // ARouter.openDebug();


        ARouter.init(this);

    }
}
