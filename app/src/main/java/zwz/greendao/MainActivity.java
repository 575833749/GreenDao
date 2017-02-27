package zwz.greendao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import zwz.greendao.bean.Animal;
import zwz.greendao.bean.Test;
import zwz.greendao.bean.Test2;
import zwz.greendao.bean.User;
import zwz.greendao.greendao.AnimalDao;
import zwz.greendao.greendao.GreenDaoManage;
import zwz.greendao.greendao.Test2Dao;
import zwz.greendao.greendao.TestDao;
import zwz.greendao.greendao.UserDao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserDao userDao = GreenDaoManage.getInstance().getUserDao();
        AnimalDao animalDao = GreenDaoManage.getInstance().getAnimalDao();
        TestDao testDao = GreenDaoManage.getInstance().getTestDao();
        Test2Dao testDao2 = GreenDaoManage.getInstance().getTest2Dao();
       /* Animal animal=new Animal();
        animal.setAnimalName("animal");
        animalDao.save(animal);

        animal=new Animal();
        animal.setAnimalName("animal2");
        animalDao.save(animal);*/

       /* User user=new User();
        user.setAge(1);
        user.setName("a");
        userDao.save(user);

        user=new User();
        user.setAge(33);
        user.setName("b");
        userDao.save(user);*/

        /*Test2 test=new Test2();
        test.setName("test2");
        testDao2.save(test);*/

        List<User> users = userDao.loadAll();
        for (int i = 0; i < users.size(); i++) {
            Log.d("vivi","------------user="+users.get(i).toString());
        }

        List<Animal> animals = animalDao.loadAll();
        for (int i = 0; i < animals.size(); i++) {

            Log.d("vivi","---------------animals="+animals.get(i).toString());
        }

        List<Test> tests = testDao.loadAll();
        for (int i = 0; i < tests.size(); i++) {

            Log.d("vivi","---------------tests="+tests.get(i).toString());
        }
        List<Test2> tests2 = testDao2.loadAll();
        for (int i = 0; i < tests2.size(); i++) {

            Log.d("vivi","---------------tests 2="+tests2.get(i).toString());
        }
    }
}
