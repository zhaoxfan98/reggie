package com.zhaoxfan.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhaoxfan.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created on 2022/7/28.
 *
 * @author zhaoxfan
 */

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
