package com.example.evid.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressResponse {

	private String EVID;
	private String village;
	private String gramaPanchyat;
	private String town;
	private String taluk;
	private String district;
	

}
