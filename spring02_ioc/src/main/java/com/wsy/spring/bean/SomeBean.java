package com.wsy.spring.bean;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-13
 * Time: 11:29
 */
public class SomeBean {

    private Integer id;

    private String name;

     SomeBean() {
    }

     SomeBean(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
