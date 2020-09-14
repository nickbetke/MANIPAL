package com.manipal.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.model.tel;

@FeignClient(name="Telephone", url="localhost:8080")
public interface CustomerProxy {
	@GetMapping("tel/{telNo}")
	public tel retro(@PathVariable String telNo);
}
