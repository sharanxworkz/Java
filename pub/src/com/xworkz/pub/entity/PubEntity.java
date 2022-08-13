package com.xworkz.pub.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pub_details")
public class PubEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="check_in_time")
	private LocalTime checkInTime;
	@Column(name="check_out_time")
	private LocalTime  checkOutTime;
	@Column(name="create_by")
	private String createBy;
	@Column(name="create_date")
	private LocalDate createDate;
	@Column(name="update_date")
	private LocalDate updateDate;
	@Column(name="owner")
	private String owner;
	@Column(name="price_per_day")
	private double pricePerDay;
	

}
