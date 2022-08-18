package com.xworkz.pencil;

import java.time.LocalDate;

import com.xworkz.pencil.dao.PencilDAO;
import com.xworkz.pencil.dao.PencilDAOImpl;
import com.xworkz.pencil.entity.PencilEntity;

public class PencilRunner {
	public static void main(String[] args) {
		PencilEntity pencilentity = new PencilEntity();
		pencilentity.setId(1);
		pencilentity.setName("apsara");
		pencilentity.setColor("black");
		pencilentity.setCreated_by("sharan");
		pencilentity.setUpdated_by("sharan");
		pencilentity.setCreated_date(LocalDate.now());
		pencilentity.setUpdated_date(LocalDate.now());

		PencilEntity pencilentity1 = new PencilEntity(2, "NATRAJ", "WHITE", "SHARAN", "ARPITHA", LocalDate.now(),
				LocalDate.now());

		PencilDAO dao = new PencilDAOImpl();

		boolean saved = dao.save(pencilentity);
		boolean save = dao.save(pencilentity1);
		PencilEntity entity1 = dao.findById(1);
		System.out.println(entity1);

		System.out.println(saved);
		System.out.println(save);

	}

}
