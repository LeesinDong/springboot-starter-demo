package com.leesin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

//springboot 默认对注入多个数据源,然后根据jar包来选择注入,
//自定义数据源的话,应该把这个两个注释掉.
//或者在多数据源中加如primary
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class
})
public class SpringbootStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStarterDemoApplication.class, args);
    }

}
