package com.registration.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.registration.dto.RegistrationDTO;
import com.registration.entinty.RegistrationEntity;
import com.registration.repo.RegistrationRepo;
import com.registration.service.RegistrationService;
@Component
public class RegistrationServiceImpl implements RegistrationService {
@Autowired
private RegistrationRepo repo;
	@Override
	public String addDetails(RegistrationDTO dto) {
		RegistrationEntity entity = new RegistrationEntity(dto.getEmployeeid(), dto.getEmployeename(), dto.getAddress(), dto.getMobile());
		repo.save(entity);
		return entity.getEmployeename();
	}
	@Override
	public List<RegistrationEntity> getAll() {
		List<RegistrationEntity> findAll = repo.findAll();
		return findAll;
	}

}
