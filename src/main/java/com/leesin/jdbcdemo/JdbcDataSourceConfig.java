package com.leesin.jdbcdemo;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/11 9:07
 * @version: ${VERSION}
 * @modified By:
 */
//多数据源
@Configuration
public class JdbcDataSourceConfig {

    /*@Primary*/   //或者在springBootConfiguration中抛出掉系统默认的
    @Bean
    @ConfigurationProperties(prefix = "app.datasource.db1")
    public DataSourceProperties db1DataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "app.datasource.db2")
    public DataSourceProperties db2DataSourceProperties(){
        return new DataSourceProperties();
    }

    /*@Primary*/
    @Bean
    //建造者模式
    public DataSource db1DataSource(){
        return db1DataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean
    public DataSource db2DataSource(){
        return db2DataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name="db1JdbcTemplate")
    public JdbcTemplate db1JdbcTemplate(){
        return new JdbcTemplate(db1DataSource());
    }

    @Bean(name="db2JdbcTemplate")
    public JdbcTemplate db2JdbcTemplate(){
        return new JdbcTemplate(db2DataSource());
    }

}
