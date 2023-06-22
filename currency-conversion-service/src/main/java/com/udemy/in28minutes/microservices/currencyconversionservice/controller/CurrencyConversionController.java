package com.udemy.in28minutes.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.in28minutes.microservices.currencyconversionservice.model.CurrencyConversion;

@RestController
public class CurrencyConversionController {
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convert(@PathVariable String from,@PathVariable String to, @PathVariable BigDecimal quantity) {
		return new CurrencyConversion(10001,from,to,BigDecimal.valueOf(65.00),quantity,BigDecimal.valueOf(650.00),"8001");
	}
}
