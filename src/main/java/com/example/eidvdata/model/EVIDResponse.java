package com.example.eidvdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EVIDResponse {

	private String electorId;
	private String electorsName;
	private String fatherName;
	private Gender sex;
	private int age;
	private Address address;                                 
}
