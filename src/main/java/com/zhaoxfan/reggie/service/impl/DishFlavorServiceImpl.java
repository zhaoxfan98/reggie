package com.zhaoxfan.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoxfan.reggie.entity.DishFlavor;
import com.zhaoxfan.reggie.mapper.DishFlavorMapper;
import com.zhaoxfan.reggie.mapper.DishMapper;
import com.zhaoxfan.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor>
        implements DishFlavorService {
}
