package com.example.habernate.Models;

import javax.persistence.*;

@Entity
@Table(name="foods_details")
public class Food_Details {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Column(name = "name")
    String name;
    @Column(name = "lastname")
    String lastname;
    @Column(name = "age")
    int age;
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @OneToOne(mappedBy = "food_details")
    private Food  food;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Food_Details{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
