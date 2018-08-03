package gr.cosmart.interview.main;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={
		"gr.cosmart.interview.*"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class}) 
//@ComponentScan
@ComponentScan("gr.cosmart.interview.resource.nav")
@ComponentScan("gr.cosmart.interview.service")
@ComponentScan("gr.cosmart.interview.dao")
@EntityScan("gr.cosmart.interview.domain")
public class CRUDProjectApplication {

    public static void main(String[] args) {
    	

        SpringApplication.run(CRUDProjectApplication.class, args);
        
//        InputStream is = this.getClass().getClassLoader().getResourceAsStream("WEB-INF/db.properties");

        
//        if(null == is)
//        {
//       	   System.err.println("Properties loading failed in AppConfig");
////            throw new Exception("Can't locate file");
//        }
//        try
//        {
//       	 properties.load(is);//this may throw IOException
//            return properties;
//        }
//        catch (IOException ioe)
//        {
//            System.err.println("Properties loading failed in AppConfig");
////            throw new Exception("Can't locate file");
//        }
        
//        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("/my.properties");
    }
}
