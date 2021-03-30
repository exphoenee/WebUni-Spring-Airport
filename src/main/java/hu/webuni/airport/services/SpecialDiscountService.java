package hu.webuni.airport.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.airport.config.AirportConfigProperties;

@Service
public class SpecialDiscountService implements DiscountService {
	
//	@Value("${airport.discount.spcial.limit}")
//	private int limit;
//	
//	@Value("${airport.discount.default.percent}")
//	private int defaultPercent;
//	
//	@Value("${airport.discount.spcial.percent}")
//	private int specialPercent;
	
	@Autowired
	AirportConfigProperties config; 
	
	@Override 
	public int getDiscountPercent(int totalPrice) {
//		return totalPrice > 10000 ? specialPercent:defaultPercent;
		return totalPrice > config.getDiscount().getSpecial().getLimit()
					? config.getDiscount().getSpecial().getPercent()
					: config.getDiscount().getDef().getPercent();
	}

}
