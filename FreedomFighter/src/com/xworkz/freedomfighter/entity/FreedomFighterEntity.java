package com.xworkz.freedomfighter.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="new_table")
public class FreedomFighterEntity extends ParentEntity {
	@Id
	private int fid;
	private String name;
	private String location;
	private LocalDate dob ;
	public FreedomFighterEntity(String createdBy, String updatedBy, LocalDate createdDate, LocalDate updatedDate,
			int fid, String name, String location, LocalDate dob) {
		super(createdBy, updatedBy, createdDate, updatedDate);
		this.fid = fid;
		this.name = name;
		this.location = location;
		this.dob = dob;
	}
	
		
		
	}
	
	
