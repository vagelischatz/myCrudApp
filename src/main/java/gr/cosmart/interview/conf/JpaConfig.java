//package gr.cosmart.interview.conf;
//
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.spi.PersistenceProvider;
//
////import javax.sql.DataSource;
//
////import org.apache.commons.dbcp2.BasicDataSource;
//import java.util.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
////import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.Database;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//
//
//import javax.sql.DataSource;
//import java.io.*;
//
//@Configuration
////@ConfigurationProperties
////@ComponentScan(basePackages = "gr.cosmart.*")
//@EnableTransactionManagement 
////@EnableJpaRepositories(basePackages = "gr.cosmart.interview.dao")
////@PropertySource("classpath:/interview/src/main/webapp/WEB-INF/db.properties")
////@EnableConfigurationProperties(JpaConfig.class)
//public class JpaConfig {
// 
// @Autowired
// private Environment env;
//
// @Bean
// public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
// 
// HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
// vendorAdapter.setDatabase(Database.MYSQL);
// vendorAdapter.setGenerateDdl(true);
// 
// LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//// em.setPersistenceProvider(new HybernatePersistenceProvider());
//
// 
// em.setDataSource(dataSource());
// em.setPackagesToScan("gr.cosmart.interview.domain");
// 
// em.setJpaVendorAdapter(vendorAdapter);
// em.setJpaProperties(additionalProperties());
// 
// return em;
// }
// 
// @Bean
//// public DataSource dataSource(){
// public DataSource dataSource() {
// DriverManagerDataSource dataSource = new DriverManagerDataSource();
////	dataSource.setDriverClassName(env.getProperty("db.driver"));
//// DataSourceBuilder dataSource = DataSourceBuilder.create();
//
// dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//	dataSource.setUrl(env.getProperty("db.url"));
//	dataSource.setUrl("jdbc:mysql://localhost:3306/crud");
////	dataSource.url("jdbc:mysql://localhost:3306/crud");
//
////	dataSource.setUsername(env.getProperty("db.username"));
////	dataSource.setPassword(env.getProperty("db.password"));
//	dataSource.setUsername("root");
//	dataSource.setPassword("root");
////	dataSource.username("root");
////	dataSource.password("root");
// return dataSource;
// }
// 
// @Bean
// public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
// JpaTransactionManager transactionManager = new JpaTransactionManager();
// transactionManager.setEntityManagerFactory(emf);
// 
// return transactionManager;
// }
// 
// @Bean
// public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
// return new PersistenceExceptionTranslationPostProcessor();
// }
//
// Properties additionalProperties() {
// Properties properties = new Properties();
//// properties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//// properties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
//// properties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
//// properties.setProperty("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
//// properties.setProperty("hibernate.current_session_context_class", env.getProperty("hibernate.current_session_context_class"));
// 
//// Properties properties = new Properties();
// InputStream is = getClass().getResourceAsStream("WEB-INF/db.properties");
// if(null == is)
// {
//	   System.err.println("Properties loading failed in AppConfig");
////     throw new Exception("Can't locate file");
// }
// try
// {
//	 properties.load(is);//this may throw IOException
//     return properties;
// }
// catch (IOException ioe)
// {
//     System.err.println("Properties loading failed in AppConfig");
////     throw new Exception("Can't locate file");
// }
// 
// properties.setProperty("hibernate.hbm2ddl.auto", "validate");
// properties.setProperty(
//   "hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
// 
// return properties;
// }
//
//}