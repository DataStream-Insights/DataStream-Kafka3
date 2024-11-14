package com.wnsud9771.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaAdminConfig {
	 @Bean
	    public AdminClient adminClient() {
	        Map<String, Object> configs = new HashMap<>();
	        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
	        return AdminClient.create(configs);
	    }
}
