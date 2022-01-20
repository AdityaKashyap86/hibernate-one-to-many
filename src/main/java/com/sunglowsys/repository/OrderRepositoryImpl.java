package com.sunglowsys.repository;

import com.sunglowsys.domain.Order;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class OrderRepositoryImpl implements  OrderRepository{
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory ();

    @Override
    public Order save(Order order) {
        Session session = sessionFactory.openSession();
        Transaction transaction =session.beginTransaction();
        Long id = (Long) session.save(order);
        session.getTransaction().commit();
        session.close ();
        return order;
    }

    @Override
    public Order update(Order order, long id) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Order findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
