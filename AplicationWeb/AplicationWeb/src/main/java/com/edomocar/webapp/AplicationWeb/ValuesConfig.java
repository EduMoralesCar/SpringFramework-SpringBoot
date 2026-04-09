package com.edomocar.webapp.AplicationWeb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:values.properties"),
        @PropertySource("classpath:config.properties")
})
public class ValuesConfig {

}
