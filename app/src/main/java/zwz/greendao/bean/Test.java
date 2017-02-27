package zwz.greendao.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Keep;

/**
 * Created by 朱伟志 on 2017/2/27 0027 16:00.
 */
@Entity
public class Test {
    @Id(autoincrement = true)
    private Long id;
    private String name;

    @Keep
    public Test(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 372557997)
    public Test() {
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
