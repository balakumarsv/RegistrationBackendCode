package com.registration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.registration.entinty.RegistrationEntity;

@Repository
@EnableJpaRepositories
public interface RegistrationRepo extends JpaRepository<RegistrationEntity, Integer> {

}
