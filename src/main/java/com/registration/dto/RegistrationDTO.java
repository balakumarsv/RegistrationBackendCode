package com.registration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDTO {
	
	private int employeeid;

    private String employeename;

    private String address;

    private int mobile;

	@Override
	public String toString() {
		return "RegistrationDTO [employeeid=" + employeeid + ", employeename=" + employeename + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
}
