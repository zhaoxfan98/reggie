package com.zhaoxfan.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoxfan.reggie.entity.Employee;
import com.zhaoxfan.reggie.mapper.EmployeeMapper;
import com.zhaoxfan.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * Created on 2022/7/28.
 *
 * @author zhaoxfan
 */

@Service            //继承父类 实现父接口 Mybatis-Plus的规范
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
