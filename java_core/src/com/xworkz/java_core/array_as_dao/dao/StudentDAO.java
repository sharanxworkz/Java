package com.xworkz.java_core.array_as_dao.dao;

import com.xworkz.java_core.array_as_dao.dto.StudentDTO;

public interface StudentDAO {
	void addStudent(StudentDTO dto);
	StudentDTO getStudent(long phno);
	void updateStudent(StudentDTO dto);


}
