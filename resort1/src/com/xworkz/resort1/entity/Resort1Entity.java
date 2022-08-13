package com.xworkz.resort1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="resort1_details")

public class Resort1Entity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="owner")
	private String owner;
	@Column(name="price_per_day")
	private double pricePerDay;

}
