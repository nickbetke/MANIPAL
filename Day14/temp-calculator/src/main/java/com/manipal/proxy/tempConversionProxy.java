package com.manipal.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.model.tempCalculatorBean;

@FeignClient(name="temp-conversion", url="localhost:8000")
public interface tempConversionProxy {
	@GetMapping("temp-conversion/from/{from}/to/{to}")
	public tempCalculatorBean retro(@PathVariable String from, @PathVariable String to);
}
