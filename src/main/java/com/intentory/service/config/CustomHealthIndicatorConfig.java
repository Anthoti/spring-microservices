package com.intentory.service.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicatorConfig implements HealthIndicator {
	@Override
	public Health health() {
		boolean serviceUp = checkExternalService();
		if (serviceUp) {
			return Health.up().withDetail("Service", "Available").build();
		} else {
			return Health.down().withDetail("Service", "Unavailable").build();
		}
	}

	private boolean checkExternalService() {
		return true;
	}
}
