package com.xworkz.bus.entity;

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
@Table(name="bus_details")

public class BusEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="location")
	private String location;
	@Column(name="created_date")
	private LocalDate createdDate;
	@Column(name="updated_date")
	private LocalDate updatedDate;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="color")
	private String color;
	@Column(name="price")
	private double price;
	@Column(name="seats")
	private double seats;
	

}
