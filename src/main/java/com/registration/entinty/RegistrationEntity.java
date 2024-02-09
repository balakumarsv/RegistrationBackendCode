package com.registration.entinty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationEntity {
	@Id
    @Column(name="employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;

    @Column(name="employee_name", length = 255)
    private String employeename;

    @Column(name="address", length = 255)
    private String address;

    @Column(name="mobile", length = 20)
    private int mobile;

	@Override
	public String toString() {
		return "RegistrationEntity [employeeid=" + employeeid + ", employeename=" + employeename + ", address="
				+ address + ", mobile=" + mobile + "]";
	}
}
