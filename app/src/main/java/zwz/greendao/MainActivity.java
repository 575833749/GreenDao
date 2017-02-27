package zwz.greendao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import zwz.greendao.bean.Animal;
import zwz.greendao.bean.User;
import zwz.greendao.greendao.AnimalDao;
import zwz.greendao.greendao.GreenDaoManage;
import zwz.greendao.greendao.UserDao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserDao userDao = GreenDaoManage.getInstance().getUserDao();
        AnimalDao animalDao = GreenDaoManage.getInstance().getAnimalDao();
        Animal animal=new Animal();
        animal.setAnimalName("animal");
        animalDao.save(animal);

        animal=new Animal();
        animal.setAnimalName("animal2");
        animalDao.save(animal);

        User user=new User();
        user.setAge(1);
        user.setName("a");
        userDao.save(user);

        user=new User();
        user.setAge(33);
        user.setName("b");
        userDao.save(user);


        List<User> users = userDao.loadAll();
        for (int i = 0; i < users.size(); i++) {
            Log.d("vivi","------------user="+users.get(i).toString());
        }

        List<Animal> animals = animalDao.loadAll();
        for (int i = 0; i < animals.size(); i++) {
            Log.d("vivi","---------------animals="+animals.get(i).toString());



        }

    }
}
