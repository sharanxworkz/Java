package com.xworkz.freedomfighter.entity;

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
private String  createdBy;
private String updatedBy;
private LocalDate createdDate;
private LocalDate updatedDate;




}
