package com.itlanma.domain;

/**
 * @author 张生祥
 * @date 2019/06/27 9:35
 */
public class Student {
    private Integer id;
    private String name;
    private Integer sex;

    private String sexStr;
    private Integer age;
    private String address;

    public String getSexStr() {
        return sexStr;
    }

    public void setSexStr(String sexStr) {
        this.sexStr = sexStr;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", sexStr='" + sexStr + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
