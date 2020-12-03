package edu.nf.obj03.demo1;

import javafx.beans.property.Property;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 */
public class Student {

    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private List<String> Hobby;
    private Map<String, String> subject;
    private Properties prop;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getHobby() {
        return Hobby;
    }

    public Map<String, String> getSubject() {
        return subject;
    }

    public Properties getProp() {
        return prop;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHobby(List<String> hobby) {
        Hobby = hobby;
    }

    public void setSubject(Map<String, String> subject) {
        this.subject = subject;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
}
