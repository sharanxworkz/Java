package com.xworkz.hotel.entity;

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
@Table(name="hotel_details")

public class HotelEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="owner")
	private String owner;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="created_date")
	private LocalDate createdDate;
	@Column(name="updated_date")
	private LocalDate updatedDate;
	@Column(name="price")
	private int price;
	@Column(name="location")
	private String location;
	@Column(name="food")
	private String food;

}
