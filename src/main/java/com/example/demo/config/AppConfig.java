package com.example.demo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan("com.example.demo.model")
public class AppConfig {
    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource sdds = new SimpleDriverDataSource();
        sdds.setDriverClass(com.mysql.jdbc.Driver.class);
        sdds.setUrl("jdbc:mysql://127.0.0.1:3306/users");
        sdds.setUsername("root");
        sdds.setPassword("root");
        return sdds;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory;
    }
}
