package com.zhaoxfan.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoxfan.reggie.entity.OrderDetail;
import com.zhaoxfan.reggie.mapper.OrderDetailMapper;
import com.zhaoxfan.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail>
     implements OrderDetailService {
}
