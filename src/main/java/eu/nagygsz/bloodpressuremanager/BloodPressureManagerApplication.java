package eu.nagygsz.bloodpressuremanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class BloodPressureManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloodPressureManagerApplication.class, args);
    }

}
