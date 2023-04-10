package com.example.eidvdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {


	private String EVID;
	private String village;
	private String gramaPanchyat;
	private String town;
	private String taluk;
	private String district;
	

}
