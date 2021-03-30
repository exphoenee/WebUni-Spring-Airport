package hu.webuni.airport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.airport.services.DiscountService;
import hu.webuni.airport.services.SpecialDiscountService;

@Configuration
@Profile("!prod")
class DiscountProdConfiguration { 

	@Bean
	public DiscountService discountService() {
		return new SpecialDiscountService();
	}
}
