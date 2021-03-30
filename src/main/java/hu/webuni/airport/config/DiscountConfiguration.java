package hu.webuni.airport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.airport.services.DefaultDiscountService;
import hu.webuni.airport.services.DiscountService;

@Configuration
@Profile("prod")
class DiscountConfiguration { 

	@Bean
	public DiscountService discountService() {
		return new DefaultDiscountService();
	}
}
