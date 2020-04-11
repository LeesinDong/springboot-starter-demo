package com.leesin;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

//所以@RunWith(SpringRunner.class)基本等同于@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)使用了Spring的SpringJUnit4ClassRunner，
// 以便在测试开始的时候自动创建Spring的应用上下文。其他的想创建spring容器的话，就得子啊web.xml配置classloder。
// 注解了@RunWith就可以直接使用spring容器，直接使用@Test注解，不用启动spring容器

// 相当于自动执行了SpringBootApplication的main
@SpringBootTest
class SpringbootStarterDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    JdbcTemplate db1JdbcTemplate;

    @Test
    public void addDataData() {
        String sql = "insert into user_info(name,age) values('mic1',18)";
        db1JdbcTemplate.execute(sql);
        System.out.println("aaaa");
    }
}
