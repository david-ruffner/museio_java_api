package com.david.museio.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("user")
public class UserConfig {
    private List<String> requiredAttrs = new ArrayList<>();

    public List<String> getRequiredAttrs() {
        return this.requiredAttrs;
    }

    public void setRequiredAttrs(List<String> requiredAttrs) {
        this.requiredAttrs = requiredAttrs;
    }
}
