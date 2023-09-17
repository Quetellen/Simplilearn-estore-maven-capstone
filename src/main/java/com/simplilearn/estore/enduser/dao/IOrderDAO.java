package com.simplilearn.estore.enduser.dao;

import com.simplilearn.estore.admin.module.Orders;
import com.simplilearn.estore.admin.module.Users;

public interface IOrderDAO {
	

	public Boolean placeOrder(Users user, Orders order);
	public Orders getOrderDetails(int orderId);
}
