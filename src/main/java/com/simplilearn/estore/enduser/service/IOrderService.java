package com.simplilearn.estore.enduser.service;

import com.simplilearn.estore.admin.module.Orders;
import com.simplilearn.estore.admin.module.Users;

public interface IOrderService {

	public Boolean placeOrder(Users user, Orders order);
}
