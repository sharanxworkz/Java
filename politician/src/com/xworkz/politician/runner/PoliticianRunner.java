package com.xworkz.politician.runner;

import com.xworkz.politician.politicianDAO.PoliticianDAO;
import com.xworkz.politician.politicianDAO.PoliticianDAOImpl;
import com.xworkz.politician.politicianDTO.PoliticianDTO;

public class PoliticianRunner {
	public static void main(String[] args) {

		PoliticianDTO dto = new PoliticianDTO(4, "aap", "aaa", 100, "groom", "banglore", "tanjavur", "tamilnadu",
				120000000);

		PoliticianDAO dao = new PoliticianDAOImpl();
		dao.save(dto);

//PoliticianDTO dto1 = new PoliticianDTO(4, "jds", "kumarswamy", 300, "gross", "banglore", "green", "karnataka", 60000000);

//dao.save(dto1);

	}

}
