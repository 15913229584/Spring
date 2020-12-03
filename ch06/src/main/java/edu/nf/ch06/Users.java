package edu.nf.ch06;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 */
public class Users {
    private String userName;
    private Integer age;
    private List<String> address;
    private Map<String,String> card;
    private Properties prop;


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getAddress() {
        return address;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public Properties getProp() {
        return prop;
    }


}
