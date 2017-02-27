package zwz.greendao.greendao;


import zwz.greendao.MyApplication;

/**
 * Created by 朱伟志 on 2017/2/27 0027 11:04.
 */
public class GreenDaoManage {
    private DaoSession mDaoSession;

    private GreenDaoManage(){
        initDb();
    }
    public static class InnerClass{
        static  GreenDaoManage mGreenDaoManage=new GreenDaoManage();
    }

    public static GreenDaoManage getInstance(){
        return InnerClass.mGreenDaoManage;
    }
    private void initDb(){
        MyOpenHelper devOpenHelper = new MyOpenHelper(MyApplication.getContext(),
                "test");
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
        mDaoSession = daoMaster.newSession();
    }

    public UserDao getUserDao(){
        UserDao userDao = mDaoSession.getUserDao();
        return userDao;
    }
    public AnimalDao getAnimalDao(){
        AnimalDao animalDao = mDaoSession.getAnimalDao();
        return animalDao;
    }

}
