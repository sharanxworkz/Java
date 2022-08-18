package com.xworkz.pencil.dao;

import com.xworkz.pencil.entity.PencilEntity;

public interface PencilDAO {
	
	boolean save(PencilEntity pencilentity);

	PencilEntity findById(int id);
}
