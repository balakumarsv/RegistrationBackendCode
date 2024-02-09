package com.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registration.dto.RegistrationDTO;
import com.registration.entinty.RegistrationEntity;
import com.registration.serviceimpl.RegistrationServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class RegistrationController {
	
	@Autowired
	private RegistrationServiceImpl impl;
	
	@PostMapping(value ="/save")
	public String saveDetails(@RequestBody RegistrationDTO dto) {
		return impl.addDetails(dto);
	}
	
	@GetMapping(value = "/getAll")
	public List<RegistrationEntity> getAllDetails() {
		List<RegistrationEntity> all = impl.getAll();
		return all;
	}
}
