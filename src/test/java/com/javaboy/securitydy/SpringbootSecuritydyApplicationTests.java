package com.javaboy.securitydy;


import com.javaboy.securitydy.bean.Menu;
import com.javaboy.securitydy.service.MenuService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootSecuritydyApplicationTests {
	@Autowired
	MenuService menuService;
	@Test
	void contextLoads() {
		List<Menu> allMenus = menuService.getAllMenus();
		System.out.println(allMenus.toString());
	}

}
