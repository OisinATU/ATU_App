package ie.atu.java.atu_app_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AtuAppDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtuAppDashboardApplication.class, args);
    }

}
