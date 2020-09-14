package com.manipal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Conversion;

@RestController
public class tempConversionController {
	@GetMapping("temp-conversion/from/{from}/to/{to}")
	public Conversion get(@PathVariable String from, @PathVariable String to) {
		return new Conversion(1, from, to);
	}
}
