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
@NamedQuery(name = "getCount", query = "select count(*) from CartoonCharacterEntity"),
@NamedQuery(name="findByMaxCreatedDate",query="select max(created_date) from CartoonCharacterEntity"),
@NamedQuery(name = "findAll", query = "select cartoon from CartoonCharacterEntity cartoon where name = :nm and country = :cc and gender = :ge and author = :at"),
@NamedQuery(name="findAuthorByName", query="select cartoon.author from CartoonCharacterEntity cartoon where cartoon.name = :nam"),
@NamedQuery(name = "findCreatedDate",query = "select cartoon.created_date from CartoonCharacterEntity cartoon where cartoon.author = :atr"),
@NamedQuery(name = "findNameAndCountry",query = "select cartoon.name,cartoon.country from CartoonCharacterEntity cartoon where cartoon.author = :date"),
@NamedQuery(name = "updateAuthor",query = "update CartoonCharacterEntity cartoon set cartoon.author = :at where cartoon.name =:nm"),
@NamedQuery(name = "updateType", query = "update CartoonCharacterEntity cartoon set cartoon.type =:type where cartoon.name = :name"),
@NamedQuery(name = "deleteByName", query = "delete from CartoonCharacterEntity cartoon where cartoon.name = :dname"),





@NamedQuery(name = "findAllByList",query = "select cartoon from CartoonCharacterEntity cartoon"),
@NamedQuery(name = "findAllByAuthor", query = "select cartoon from CartoonCharacterEntity cartoon where cartoon.author = :atr"),
@NamedQuery(name = "findAllByAuthorAndGender",query = "select cartoon from CartoonCharacterEntity cartoon where cartoon.author =:aut and cartoon.gender=:gen"),
@NamedQuery(name = "findAllName",query = "select cartoon.name from CartoonCharacterEntity cartoon"),
@NamedQuery(name = "findAllCountry", query = "select cartoon.country from CartoonCharacterEntity cartoon"),
@NamedQuery(name = "findAllNameAndCountry", query = "select cartoon.name,cartoon.country from CartoonCharacterEntity cartoon"),
@NamedQuery(name = "findAllNameAndCountryAndAuthor", query = "select cartoon.name,cartoon.country,cartoon.author from CartoonCharacterEntity cartoon")
})
//String findAuthorByName(String name);                                        


public class CartoonCharacterEntity extends ParentEntity{
	@GenericGenerator(name="sharan", strategy="increment")
	@GeneratedValue(generator = "sharan")
	@Id
//private int cid;
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
