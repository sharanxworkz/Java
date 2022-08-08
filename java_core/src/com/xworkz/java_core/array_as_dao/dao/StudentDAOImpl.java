package com.xworkz.java_core.array_as_dao.dao;

import com.xworkz.java_core.array_as_dao.dto.StudentDTO;

public class StudentDAOImpl implements StudentDAO {
	
	StudentDTO[] students = new StudentDTO[10];

	int index = 0;

	@Override
	public void addStudent(StudentDTO dto) {
		this.students[this.index] = dto;
		this.index++;
	}

	@Override
	public StudentDTO getStudent(long phno) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getPhno() == phno) {
				return students[i];
			}

		}
		return null;

	}

	@Override
	public void updateStudent(StudentDTO dto) {
		// TODO Auto-generated method stub

	}


}
