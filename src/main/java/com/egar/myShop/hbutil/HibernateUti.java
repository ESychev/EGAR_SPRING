package com.egar.myShop.hbutil;

//import com.egar.myShop.entity.*;
//import com.fasterxml.classmate.AnnotationConfiguration;
//import org.hibernate.SessionFactory;
//
////import org.hibernate.cfg.AnnotationConfiguration;
//
//
//public class HibernateUti {
//
//    //Создаем нашу SessionFactory.
//    private static final SessionFactory sessionFactory;
//
//
//    static {
//        try {
//            //Создаем новый екземпляр AnnotationConfiguration
//            AnnotationConfiguration ac = new AnnotationConfiguration();
//            //Это нам нужно для того, чтобы мы добавили все наши классы сущности.
//            //каждый ваш Entity здесь нужно прописать, не пропишете - не будет работать.
//            ac.addAnnotatedClass(Basket.class).addAnnotatedClass(Deliverytype.class).addAnnotatedClass(Order.class)
//                    .addAnnotatedClass(Permission.class).addAnnotatedClass(Product.class).
//                    addAnnotatedClass(ProductBasket.class).addAnnotatedClass(ProductOrder.class).addAnnotatedClass(Role.class).addAnnotatedClass(User.class);
//            //Вот мы собственно и создали нашу Фабрику сессий.
//            //Она нужна т.к с БД мы работаем через сессии
//            //Подробности будут чуть позже, пока знайте, как ее сделать и как с ней работать.
//            sessionFactory = ac.configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            // Log the exception.
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//}
