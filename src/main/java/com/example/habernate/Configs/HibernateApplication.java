package com.example.habernate.Configs;

import com.example.habernate.Models.Food;
import com.example.habernate.Models.Food_Details;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
public class HibernateApplication {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Food.class)
                .addAnnotatedClass(Food_Details.class)
                .buildSessionFactory();
        Session session = null;


//        add food


//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Food food = new User("apple",12);
//        session.save(food);
//        System.out.println(food);
//        System.out.println("hello");
//        session.getTransaction().commit();
//


        // search food

//
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Food food = session.get(Food.class,2L);
//        System.out.println(food);
//        System.out.println(122);
//        session.getTransaction().commit();
//

        // UPDATE

//
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Food food = session.get(Food.class,2L);
//        System.out.println(food);
//        food.setName("fish");
//        food.setPrice(1000);
//        session.getTransaction().commit();



//          DELETE
//
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Food food = session.get(Food.class,3L);
//        session.remove(food);
//        session.getTransaction().commit();




//            OneToOne

//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Food food = session.get(Food.class,1);
//        System.out.println(food);
//        System.out.println(food.getFood_details());
//
//        session.getTransaction().commit();
//        sessionFactory.close();





    }

}
