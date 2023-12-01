package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {

    /**
     * 新增菜品
     * @param dishDTO dishDTO
     */
    void saveWithFlavor(DishDTO dishDTO);


    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    DishVO getDishByIdWithFlavors(Long id);

    void deleteBatch(List<Long> ids);

    void updateWithFlavor(DishDTO dishDTO);
}
