package com.yaminSolution.dao;

import java.util.ArrayList;

import com.yaminSolution.model.Batches;
import com.yaminSolution.model.Student;

public interface DAO {

	
	void createConnection();
	void closeConnection();

	void createStudent(Student student);
	void deleteStudent(int sid);
	ArrayList<Student> getAllStudents();
	
	void createBatch(Batches batch);
	void deleteBatch(int bid);
	ArrayList<Batches> getAllBatches();

}
