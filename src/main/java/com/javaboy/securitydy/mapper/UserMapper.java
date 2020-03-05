package com.javaboy.securitydy.mapper;

import com.javaboy.securitydy.bean.Role;
import com.javaboy.securitydy.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User loadUserByUsername(String username);

    List<Role> getRolesById(Integer id);
}
