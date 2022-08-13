package com.xworkz.hotel.dao;

import com.xworkz.hotel.entity.HotelEntity;

public interface HotelDAO {
	
	boolean save(HotelEntity hotelentity);
	
	HotelEntity findById(int id);
	
	void updateOwnerAndPriceById(String newOwner , int newPrice, int id);

}
