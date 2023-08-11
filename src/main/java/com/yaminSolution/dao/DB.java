package com.yaminSolution.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import com.yaminSolution.model.Batches;
import com.yaminSolution.model.Student;

public class DB implements DAO{
		
		Connection connection;
		Statement statement;
		PreparedStatement preparedStatement;
		 
		final String TAG = "["+getClass().getSimpleName()+"]";
		
		public DB() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println(TAG+"driver loaded");
				
				
			}catch (Exception e) { 
					System.out.println("exception occured: "+e);	
				}
	}

		@Override
		public void createConnection() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void closeConnection() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void createStudent(Student student) {

			try {
				String sql = "insert into student values(null, ?, ?, ?, ?)";
				System.out.println("SQL is: "+sql);
				
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, student.getFname());
				preparedStatement.setString(2, student.getLname());
				preparedStatement.setString(3, student.getSid());
				preparedStatement.setString(4, student.getSkill());
			

				
				
				int result = statement.executeUpdate(sql);
				String message = result > 0 ?" Student Created Successfully" : "Student not created please try again later..";
				System.out.println(TAG+message);
				
			} catch (Exception e) {
				System.out.println("exception occured: "+e);	
			}
		}			
		

		@Override
		public void deleteStudent(int sid) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public ArrayList<Student> getAllStudents() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void createBatch(Batches batch) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteBatch(int bid) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public ArrayList<Batches> getAllBatches() {
			// TODO Auto-generated method stub
			return null;
		}
}
