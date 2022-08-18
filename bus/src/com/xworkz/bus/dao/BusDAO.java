package com.xworkz.bus.dao;

import com.xworkz.bus.entity.BusEntity;

public interface BusDAO {
boolean save (BusEntity busentity);
BusEntity findById(int  id);
BusEntity findId(int id);
void updateNameAndLocationById(String newColor,String newLocation,int id);
void deleteById(int id);
}
