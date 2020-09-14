package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.tempCalculatorBean;
import com.manipal.proxy.tempConversionProxy;

@RestController
public class tempCalculatorController {
	@Autowired
	private tempConversionProxy proxy;
	
	
	@GetMapping()
	public String welcome() {
		return "Welcome to temp calculator";
	}
	
	@GetMapping("temp-calcultor/from/{from}/to/{to}/units/{units}")
	public tempCalculatorBean cal(@PathVariable String from, @PathVariable String to, @PathVariable int units) {
		tempCalculatorBean bean = proxy.retro(from, to);
		System.out.println(bean.getTotalUnits());
		double totalUnits = bean.getMultiple();
		System.out.println("================================================="+ totalUnits + "================================================");
		if(totalUnits == 1.8) {
			totalUnits = units * totalUnits + 32;
//			System.out.println("TU " + totalUnits);
		}
		else if(totalUnits == 0.5555555555555556) {
			totalUnits = (units-32)*totalUnits;
//			System.out.println("TU " + totalUnits);
		}
		else
			totalUnits = units;
		return new tempCalculatorBean(1, from, to, bean.getMultiple(), units, totalUnits);
	}
	
}
