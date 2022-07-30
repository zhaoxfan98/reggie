package com.zhaoxfan.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoxfan.reggie.entity.ShoppingCart;
import com.zhaoxfan.reggie.mapper.ShoppingCartMapper;
import com.zhaoxfan.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>
     implements ShoppingCartService {
}
