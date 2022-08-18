package com.xworkz.pencil.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="pencil_details")

public class PencilEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="color")
	private String color;
	@Column(name="created_by")
	private String created_by;
	@Column(name="updated_by")
	private String updated_by;
	@Column(name="created_date")
	private LocalDate created_date;
	@Column(name="updated_date")
	private LocalDate updated_date;

}
