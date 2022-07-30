package com.zhaoxfan.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoxfan.reggie.entity.SetmealDish;
import com.zhaoxfan.reggie.mapper.SetmealDishMapper;
import com.zhaoxfan.reggie.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish>
          implements SetmealDishService {
}
