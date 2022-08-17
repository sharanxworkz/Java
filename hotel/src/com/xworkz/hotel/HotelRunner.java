package com.xworkz.hotel;

import java.time.LocalDate;

import com.xworkz.hotel.dao.HotelDAO;
import com.xworkz.hotel.dao.HotelDAOImpl;
import com.xworkz.hotel.entity.HotelEntity;

public class HotelRunner {

	public static void main(String[] args) {

		HotelEntity hotelentity = new HotelEntity();
		hotelentity.setId(1);
		hotelentity.setOwner("sharan");
		hotelentity.setCreatedBy("sharan");
		hotelentity.setUpdatedBy("amana");
		hotelentity.setCreatedDate(LocalDate.now());
		hotelentity.setUpdatedDate(LocalDate.now());
		hotelentity.setPrice(4000);
		hotelentity.setLocation("BHATKAL");
		hotelentity.setFood("CHICKEN BIRYANI");

		HotelDAO hoteldao = new HotelDAOImpl();
		boolean save = hoteldao.save(hotelentity);
		System.out.println(save);
		HotelEntity info = hoteldao.findById(1);
		System.out.println(info);

		hoteldao.updateOwnerAndPriceById("sudhir", 20000, 1);

	}

}
