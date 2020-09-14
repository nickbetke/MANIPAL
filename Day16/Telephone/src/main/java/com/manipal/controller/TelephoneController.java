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

import com.manipal.model.Telephone;
import com.manipal.service.ITelephoneService;
import com.manipal.service.TelephoneService;

@RestController
public class TelephoneController {
	@Autowired 
	ITelephoneService telephoneService;
	
	@GetMapping("home")
	public List<String> home(){
		List<String> a = new LinkedList();
		a.add("count");
		a.add("all");
		a.add("add");
		a.add("id/id");
		a.add("delete/id");
		a.add("update");
		a.add("tel/{telNo}");
		return a;
	}
	@GetMapping
	public String s() {
		return "Welcome to Telephone";
	}
	
	@GetMapping("count")
	public long count() {
		return telephoneService.count();
	}
	@PostMapping("add")
	public String add(@RequestBody Telephone t) {
		return telephoneService.add(t);
	}
	@GetMapping("all")
	public List<Telephone> showAll(){
		return telephoneService.showAll();
	}
	
	@GetMapping("id/{id}")
	public Telephone getById(@PathVariable int id) {
		return telephoneService.getById(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		return telephoneService.deleteById(id);
	}
	@PutMapping("update")
	public ResponseEntity<Telephone> update(@RequestBody Telephone t){
		Telephone d = telephoneService.getById(t.gettId());
		if(d==null) {
			d.setMobile(t.getMobile());
			d.setTelNo(t.getTelNo());
		}
		else
			telephoneService.add(t);
		ResponseEntity<Telephone> r = new ResponseEntity<Telephone>(d, HttpStatus.OK);
		return r;
	}
	
	
	@GetMapping("tel/{telNo}")
	public Telephone getByTel(@PathVariable String telNo) {
		return telephoneService.getByTel(telNo);
	}
	
	
	
	
	
	
}
