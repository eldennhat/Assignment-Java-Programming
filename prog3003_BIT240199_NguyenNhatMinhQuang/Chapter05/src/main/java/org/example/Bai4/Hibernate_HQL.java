package org.example.Bai4;

import org.example.Bai3.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class Hibernate_HQL {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();
        Session session = factory.openSession();

        try {
            session.beginTransaction();
            String hql = "FROM Product p WHERE p.price > 1000";
            List<Product> expensiveProducts = session.createQuery(hql, Product.class).getResultList();
            System.out.println("--- Danh sách sản phẩm giá > 1000 ---");
            if (expensiveProducts.isEmpty()) {
                System.out.println("Không có sản phẩm nào thỏa mãn điều kiện.");
            } else {
                for (Product p : expensiveProducts) {
                    System.out.println(p);
                }
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}
