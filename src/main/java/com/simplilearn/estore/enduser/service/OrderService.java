package com.simplilearn.estore.enduser.service;

import com.simplilearn.estore.admin.module.Orders;
import com.simplilearn.estore.admin.module.Users;
import com.simplilearn.estore.enduser.dao.OrderDAO;

public class OrderService implements IOrderService {


    OrderDAO dao;

    public OrderService() {
        dao = new OrderDAO();
    }

    @Override
    public Boolean placeOrder(Users user, Orders order) {
        return dao.placeOrder(user, order);
    }
}
