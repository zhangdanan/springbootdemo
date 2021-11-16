package zdn.springbootdataformat.domain;


import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer id;

    private String name;

    private String password;

    private Date  createtime;

    public User(Integer id, String name, String password, Date createtime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.createtime = createtime;
    }
}
