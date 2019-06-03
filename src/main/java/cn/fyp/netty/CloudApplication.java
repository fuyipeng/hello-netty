package cn.fyp.netty;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hasee
 */
@SpringBootApplication
public class CloudApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }

    @Override
    public void run(String... strings) {
    }
}
