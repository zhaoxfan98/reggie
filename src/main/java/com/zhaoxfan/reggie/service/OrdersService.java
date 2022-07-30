package com.zhaoxfan.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaoxfan.reggie.entity.OrderDetail;
import com.zhaoxfan.reggie.entity.Orders;

import java.util.List;

public interface OrdersService extends IService<Orders> {

    public void submit(Orders orders);

    public List<OrderDetail> getOrderDetailsByOrderId(Long orderId);
}
