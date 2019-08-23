package com.example.demoweb;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "demo")
@Data
public class DemoApplicationProperties {

    private Integer number;
    private String username;
    private String telephoneNumber;
    private List<String> emailAddresses =
            Arrays.asList("shazin@techtalks.lk");
    private String firstName;
    private String lastName;
    private Duration workingTime;
}
