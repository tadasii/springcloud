package zz.model;

import java.util.Date;

/**
 * Created by zhangzheng on 2019/3/27.
 */
public class User {
    private long id;
    private Date date;

    public User() {
    }

    public User(long id) {
        this.id = id;
        this.date = new Date();
    }

    public User(long id, Date date) {
        this.id = id;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
