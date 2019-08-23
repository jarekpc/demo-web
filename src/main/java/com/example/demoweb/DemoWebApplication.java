package com.example.demoweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.util.List;

@SpringBootApplication
@Slf4j
//@EnableConfigurationProperties(DemoApplicationProperties.class)
public class DemoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }
//
//    @Autowired
//    DemoApplicationProperties demoApplicationProperties;
//
//    @Bean
//    public ApplicationRunner runner(DemoApplicationProperties myApplicationProperties, Environment environment) {
//        return args -> {
//            List<Address> addresses = Binder.get(environment).bind("demo.address", Bindable.listOf(Address.class)).orElseThrow(IllegalStateException::new);
//            System.out.printf("Demo Addresses : %s\n", addresses);
//
//            // DEMO_ENV_1 Environment Variable
//            System.out.printf("Demo Env 1 : %s\n", environment.getProperty("demo.env[1]"));
//
//            System.out.printf("Demo First Name : %s\n", myApplicationProperties.getFirstName());
//            System.out.printf("Demo Last Name : %s\n", myApplicationProperties.getLastName());
//            System.out.printf("Demo Username : %s\n", myApplicationProperties.getUsername());
//            System.out.printf("Demo Working Time (Hours) : %s\n", myApplicationProperties.getWorkingTime().toHours());
//            System.out.printf("Demo Number : %d\n", myApplicationProperties.getNumber());
//            System.out.printf("Demo Telephone Number : %s\n", myApplicationProperties.getTelephoneNumber());
//            System.out.printf("Demo Email 1 : %s\n", myApplicationProperties.getEmailAddresses().get(0));
//            System.out.printf("Demo Email 2 : %s\n", myApplicationProperties.getEmailAddresses().get(1));
//        };
//    }

}
