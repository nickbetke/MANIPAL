package com.manipal.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Customer;
import com.manipal.model.tel;
import com.manipal.proxy.CustomerProxy;
import com.manipal.service.ICustomerService;

@RestController
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	
	@Autowired
	private CustomerProxy proxy;
	
	
	@GetMapping("home")
	public List<String> home(){
		List<String> a = new LinkedList();
		a.add("count");
		a.add("all");
		a.add("add");
		a.add("id/id");
		a.add("delete/id");
		a.add("update");
		a.add("telephone/{telNo}");
		a.add("telephone/{id}");
		return a;
	}
	
	
	@GetMapping
	public String welcome() {
		return "Welcome to Customer";
	}
	
	@GetMapping("count")
	public long count() {
		return customerService.count();
	}
	
	@GetMapping("all")
	public List<Customer> showAll(){
		return customerService.showAll();
	}
	@PostMapping("add")
	public String add(@RequestBody Customer c) {
		return customerService.add(c);
	}
	
	@GetMapping("id/{id}")
	public Customer getById(@PathVariable int id) {
		return customerService.getById(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		return customerService.delete(id);
	}
	
	@PutMapping("update")
	public ResponseEntity<Customer> update(@RequestBody Customer c) {
		Customer d = customerService.getById(c.getId());
		if(d==null) {
			d.setDob(c.getDob());
			d.setEmail(c.getEmail());
			d.setfName(c.getfName());
			d.setlName(c.getlName());
			d.setTelephone(c.getTelephone());
		}
		else
			customerService.update(c);
		ResponseEntity<Customer> r = new ResponseEntity<>(d, HttpStatus.OK);
		return r;
	}
	
	@GetMapping("telephone/{id}/{telNo}")
	public tel getTel(@PathVariable String telNo) {
		tel bean = proxy.retro(telNo);
		System.out.println(bean);
		return new tel(bean.gettId(), bean.getTelNo(), bean.getMobile());
		
	}
	
	@GetMapping("telephone/{id}")
	public tel getTel(@PathVariable int id) {
		String telNo = customerService.getById(id).getTelephone();
		tel bean = proxy.retro(telNo);
		System.out.println(bean);
		return new tel(bean.gettId(), bean.getTelNo(), bean.getMobile());
		
	}
	
	
}

