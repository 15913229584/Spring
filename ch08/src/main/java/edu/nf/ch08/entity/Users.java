package edu.nf.ch08.entity;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 */
public class Users {
    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    private  Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String userName;
}
