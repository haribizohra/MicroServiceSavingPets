package com.microservice.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

	@Autowired
	AuthenticationFilter filter;

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes().route("user-service", r -> r
				.path("/api/users/**", "/api/auth/**")
				.filters(f -> f.filter(filter).circuitBreaker(
						config -> config.setName("user-service-circuit-breaker").setFallbackUri("forward:/user-auth-fallback")))
				.uri("lb://user-service"))
				.route("forum-service",
						r -> r.path("/api/forum/**").filters(f -> f.filter(filter)).uri("lb://forum-service"))
				.build();
	}
}
