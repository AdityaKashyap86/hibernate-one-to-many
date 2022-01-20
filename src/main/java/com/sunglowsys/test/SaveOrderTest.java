package com.sunglowsys.test;

import com.sunglowsys.domain.Cutomer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.repository.OrderRepository;
import com.sunglowsys.service.OrderService;
import com.sunglowsys.service.OrderServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class SaveOrderTest {

    public static void main(String[] args) {
        Cutomer cutomer = new Cutomer ("dinesh","kumar","dineshzz600@GMAIL.COM","8465464365");
        Cutomer cutomer1  = new Cutomer ("aditya","kashyap","aditya@gmail.com","98376637");
        List<Cutomer> cutomers = new ArrayList<> ();
        cutomers.add(cutomer);
        cutomers.add (cutomer1);


        Order order = new Order ("Vishal","kashyap","vishal@gmial.com","Kasganj",cutomers);
        OrderService orderService = new OrderServiceImpl ();
        new OrderServiceImpl ().save(order);
        System.out.println ("saved_programm"+order);
    }
}
