//package gr.cosmart.interview.conf;
//
//import javax.sql.DataSource;
//
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//
//@Configuration
//@PropertySource("classpath:/interview/src/main/webapp/WEB-INF/db.properties")
//public class MySQLConfig {
//
//	@Autowired
//	private Environment env;
//
//	@Bean
//	public DataSource getMySQLDataSource() {
//		BasicDataSource dataSource = new BasicDataSource();
//		dataSource.setDriverClassName(env.getProperty("db.driver"));
//		dataSource.setUrl(env.getProperty("db.url"));
//		dataSource.setUsername(env.getProperty("db.username"));
//		dataSource.setPassword(env.getProperty("db.password"));
////		dataSource.setTestOnBorrow(true);
//		
//		return dataSource;
//	    
//		
//	}
//
//}
