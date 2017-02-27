package zwz.greendao.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by 朱伟志 on 2017/2/27 0027 14:46.
 */
public class MyOpenHelper extends DaoMaster.OpenHelper {

    public MyOpenHelper(Context context, String name) {
        super(context, name);
    }
    public MyOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("greenDAO",
                "Upgrading schema from version " + oldVersion + " to " + newVersion + " by migrating all tables data");

        //数据库升级  升级UserDao
        MigrationHelper.migrate(db, UserDao.class);
    }
}
