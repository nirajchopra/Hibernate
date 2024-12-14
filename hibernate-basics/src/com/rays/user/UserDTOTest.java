package com.rays.user;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDTOTest{

     public static void main(String[] args) {

        UserDTO dto = new UserDTO();
        dto.setId(1);
        dto.setFirstName("Niraj");
        dto.setLastName("Chopra");
        dto.setLoginId("nirajchopra@gmail.com");
        dto.setPassword("Niraj@123"); 
        dto.setDob(new Date());
        dto.setAddress("Indore");

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(dto);

        tx.commit();
        session.close();
        sf.close();

        System.out.println("User saved successfully!");
    }
}
