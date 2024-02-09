package com.registration.service;

import java.util.List;

import com.registration.dto.RegistrationDTO;
import com.registration.entinty.RegistrationEntity;

@org.springframework.stereotype.Service
public interface RegistrationService {
	String addDetails(RegistrationDTO dto);
	List<RegistrationEntity> getAll();
}
