package zwz.greendao.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 朱伟志 on 2017/2/27 0027 16:04.
 */
@Entity
public class Test2 {
    private Long id;
    private String name;

    @Generated(hash = 1331251693)
    public Test2(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 1885849886)
    public Test2() {
    }

    @Override
    public String toString() {
        return "Test2{" +
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
