package org.example.Bai3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveProduct {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = null;

        try {
            Product newProduct = new Product("Laptop", 1500.0);
            tx = session.beginTransaction();
            session.save(newProduct);
            tx.commit();
            System.out.println("Đã lưu sản phẩm thành công: " + newProduct);
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}
