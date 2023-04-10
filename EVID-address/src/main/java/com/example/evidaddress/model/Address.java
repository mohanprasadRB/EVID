package com.example.evidaddress.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Address {

	@Id
	@Column(name = "evid")
	private String EVID;
	private String village;
	private String gramaPanchyat;
	private String town;
	private String taluk;
	private String district;
	

}
