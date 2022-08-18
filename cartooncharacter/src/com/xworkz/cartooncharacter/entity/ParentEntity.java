package com.xworkz.cartooncharacter.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class ParentEntity {
	private String created_by;
	private String updated_by;
	private LocalDate  created_date;
	private LocalDate updated_date;

}
