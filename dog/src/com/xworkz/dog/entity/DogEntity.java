package com.xworkz.dog.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="dog_info")
public class DogEntity {
	@Id
	@Column(name="id")
private int id;
	@Column(name="name")
private String name;
	@Column(name="breed")
private String breed;
	@Column(name="created_by")
private String createdBy ;
	@Column(name="updated_by")
private String updatedBy;
	@Column(name="created_date")
private LocalDate createdDate;
	@Column(name="updated_date")
private LocalDate updatedDate;
	@Column(name="age")
private int age;


}
