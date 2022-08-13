package com.xworkz.pub;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.pub.dao.PubDAO;
import com.xworkz.pub.dao.PubDAOImpl;

import com.xworkz.pub.entity.PubEntity;

public class PubRunner {
	
	public static void main(String[] args) {
		PubEntity entity=new PubEntity();
		entity.setId(1);
		entity.setName("Honey Dew");
		entity.setLocation("btm");
		entity.setCheckInTime(LocalTime.of(12, 00));
		entity.setCheckOutTime(LocalTime.of(11, 00));
		entity.setCreateBy("Arpitha");
		entity.setCreateDate(LocalDate.now());
		entity.setOwner("sharan");
		entity.setPricePerDay(2000D);
		entity.setUpdateDate(LocalDate.now());
		
		
		
		PubDAO dao=new PubDAOImpl();
		boolean saved=dao.save(entity);
		System.out.println(saved);
		
		
		
	}

}
