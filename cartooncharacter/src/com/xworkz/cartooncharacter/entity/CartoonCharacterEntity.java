package com.xworkz.cartooncharacter.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cartooncharacter_details")
@Entity
@NamedQueries({
@NamedQuery(name = "findByName",query = "select cartoon from CartoonCharacterEntity cartoon where cartoon.name = :nm"),
@NamedQuery(name = "getCount", query = "select count(*) from CartoonCharacterEntity")
})
                                           


public class CartoonCharacterEntity extends ParentEntity{
	@GenericGenerator(name="sharan", strategy="increment")
	@GeneratedValue(generator = "sharan")
	@Id
	private int cid;
	private String name;
	private String country;
	private String gender;
	private String author;
	private String type;
	
	public CartoonCharacterEntity( String name, String country, String gender, String author, String type,String createdBy,String updatedBy,LocalDate createdDate,LocalDate updatedDate) {
		super(createdBy,updatedBy,createdDate,updatedDate);
		
		this.name = name;
		this.country = country;
		this.gender = gender;
		this.author = author;
		this.type = type;
	}

}
