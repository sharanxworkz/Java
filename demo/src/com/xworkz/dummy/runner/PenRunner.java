package com.xworkz.dummy.runner;

import com.xworkz.dummy.constants.Brand;
import com.xworkz.dummy.dummyDAO.PenDAO;
import com.xworkz.dummy.dummyDAO.PenDAOImpl;
import com.xworkz.dummy.dummyDTO.PenDTO;

public class PenRunner {

	public static void main(String[] args) {
		PenDTO penDTO = new PenDTO(1,Brand.BALLPEN,"Blue",20);
		PenDTO penDTO1 = new PenDTO(4,Brand.INK,"Black",30);
		PenDAO penDAO = new PenDAOImpl();
//		penDAO.save(penDTO);
//		penDAO.save(penDTO1);
		PenDTO dto = penDAO.getDetails(1);
		System.out.println(dto);
	}

}
