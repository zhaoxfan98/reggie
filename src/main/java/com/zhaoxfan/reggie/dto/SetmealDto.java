package com.zhaoxfan.reggie.dto;

import com.zhaoxfan.reggie.entity.Setmeal;
import com.zhaoxfan.reggie.entity.SetmealDish;

import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
