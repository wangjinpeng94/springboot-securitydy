package com.javaboy.securitydy.config;

import com.javaboy.securitydy.bean.Menu;
import com.javaboy.securitydy.bean.Role;
import com.javaboy.securitydy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.security.access.SecurityConfig;


import java.util.Collection;
import java.util.List;

@Component
public class MyFilter implements FilterInvocationSecurityMetadataSource {
    AntPathMatcher pathMatcher = new AntPathMatcher();
@Autowired
    MenuService menuService;


    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        List<Menu> allMenus = menuService.getAllMenus();
        for (Menu menu : allMenus) {
            if (pathMatcher.match(menu.getPattern(),requestUrl)) {
                List<Role> roles = menu.getRoles();
                String[] rolesStr=new String[roles.size()];
                for (int i=0;i<roles.size();i++){
                    rolesStr[i]=roles.get(i).getName();
                }

                return SecurityConfig.createList(rolesStr);
            }
        }
        return SecurityConfig.createList("ROLE_login");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
