package com.xworkz.dummy.dummyDAO;

import com.xworkz.dummy.dummyDTO.PenDTO;

public interface PenDAO {
	
	Boolean save(PenDTO penDTO);
	PenDTO getDetails(Integer id);

	
}
