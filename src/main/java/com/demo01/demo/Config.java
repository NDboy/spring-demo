package com.demo01.demo;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.sql.SQLException;

//@Configuration
//@ComponentScan(basePackageClasses = Config.class)
//@PropertySource("classpath:/application.properties")
public class Config {

//    @Autowired
//    private Environment environment;
//
//    @Bean
//    public DataSource dataSource() {
//        try {
//            MariaDbDataSource dataSource = new MariaDbDataSource();
//            dataSource.setUrl(environment.getProperty("jdbc.url"));
//            dataSource.setUser(environment.getProperty("jdbc.username"));
//            dataSource.setPassword(environment.getProperty("jdbc.password"));
//            return dataSource;
//        } catch (SQLException se) {
//            throw new IllegalStateException("Can not create datasource", se);
//        }
//    }
//
//    @Bean
//    public JpaTransactionManager transactionManager() {
//        return new JpaTransactionManager();
//    }
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//        HibernateJpaVendorAdapter hibernateJpaVendorAdapter =
//                new HibernateJpaVendorAdapter();
//        hibernateJpaVendorAdapter.setShowSql(true);
//        return hibernateJpaVendorAdapter;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean =
//                new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());
//        entityManagerFactoryBean.setDataSource(dataSource);
//        entityManagerFactoryBean.setPackagesToScan("com.demo01.demo");
//        return entityManagerFactoryBean;
//    }

}
