package zwz.greendao.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 朱伟志 on 2017/2/27 0027 14:29.
 */
@Entity
public class Animal {
    @Id(autoincrement = true)
    private Long id;
    private String animalName;
    @Generated(hash = 632427234)
    public Animal(Long id, String animalName) {
        this.id = id;
        this.animalName = animalName;
    }
    @Generated(hash = 308569294)
    public Animal() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAnimalName() {
        return this.animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                '}';
    }
}
