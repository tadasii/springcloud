package zz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhangzheng on 2019/3/27.
 */
@SpringBootApplication
@EnableEurekaClient
public class ComsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ComsumerApp.class);
    }
    @Bean
    public RestTemplate getRest(){
        return new RestTemplate();
    }
}
