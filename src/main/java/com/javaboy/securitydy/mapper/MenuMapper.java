package com.javaboy.securitydy.mapper;

import com.javaboy.securitydy.bean.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getAllMenus();
}
