package com.example.habernate.Models;

import javax.persistence.*;

@Entity
@Table(name="foods")
public class Food {
    @Column(name="name")
    private String name;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food_Details getFood_details() {
        return food_details;
    }

    public void setFood_details(Food_Details food_details) {
        this.food_details = food_details;
    }

    @OneToOne
    @JoinColumn(name="details_id")
    private Food_Details food_details;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public Food(){}
    public Food(String name, double price) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +

                ", id=" + id +
                '}';
    }
}
