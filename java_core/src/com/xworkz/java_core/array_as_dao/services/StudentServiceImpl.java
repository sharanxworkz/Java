package com.xworkz.java_core.array_as_dao.services;

import com.xworkz.java_core.array_as_dao.dao.StudentDAO;
import com.xworkz.java_core.array_as_dao.dao.StudentDAOImpl;
import com.xworkz.java_core.array_as_dao.dto.StudentDTO;

public class StudentServiceImpl  implements StudentService{
	StudentDAO studentDAO = new StudentDAOImpl();

	@Override
	public void addStudent(StudentDTO dto) {
		long number = dto.getPhno();
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		if (count == 10) {
			studentDAO.addStudent(dto);
			System.out.println(dto);
		}

		else {
			System.out.println("Invalid number");
		}
	}

	@Override
	public StudentDTO getStudent(long phno) {
		return studentDAO.getStudent(phno);
	}

	@Override
	public void updateStudent(StudentDTO dto) {

		System.out.println("batch is updated");

	}


}
