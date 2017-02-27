package zwz.greendao;

import android.app.Application;
import android.content.Context;

import zwz.greendao.greendao.GreenDaoManage;

/**
 * Created by 朱伟志 on 2017/2/27 0027 11:27.
 */
public class MyApplication extends Application {
    private  static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();
        GreenDaoManage.getInstance();
    }

    public static Context getContext(){
        return mContext;
    }
}
