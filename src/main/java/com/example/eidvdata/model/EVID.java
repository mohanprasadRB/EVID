package com.example.eidvdata.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class EVID {

	@Id
	@Column(name = "EVID")
	private String electorId;
	private String electorsName;
	private String fatherName;

	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private Gender sex;
	private int age;
}
