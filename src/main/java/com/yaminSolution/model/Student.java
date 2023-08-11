package com.yaminSolution.model;

import java.util.Date;

public class Student {
	
		
		String fname;
		String lname;
		String sid;
		String skill;
		
		
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getSid() {
			return sid;
		}
		public void setSid(String sid) {
			this.sid = sid;
		}
	
		
		public String getSkill() {
			return skill;
		}
		public void setSkill(String rank) {
			this.skill = rank;
		}
		public Student(String fname, String lname, String sid, Date startDate, String rank) {
			super();
			this.fname = fname;
			this.lname = lname;
			this.sid = sid;
			this.skill = rank;
		}
		@Override
		public String toString() {
			return "Student [fname=" + fname + ", lname=" + lname + ", sid=" + sid + ", skill=" + skill + "]";
		}

					 
		}
	
	
		
	
	
		
