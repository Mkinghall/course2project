package com.yaminSolution.model;

public class Batches {
	
		int batchId;
		String batchTime;
		int enrolled;
		
		
		public int getBatchId() {
			return batchId;
		}
		public void setBatchId(int batchId) {
			this.batchId = batchId;
		}
		public String getBatchTime() {
			return batchTime;
		}
		public void setBatchTime(String batchTime) {
			this.batchTime = batchTime;
		}
		public int getEnrolled() {
			return enrolled;
		}
		public void setEnrolled(int enrolled) {
			this.enrolled = enrolled;
		}
		public Batches(int batchId, String batchTime, int enrolled) {
			super();
			this.batchId = batchId;
			this.batchTime = batchTime;
			this.enrolled = enrolled;
		}
		@Override
		public String toString() {
			return "Batches [batchId=" + batchId + ", batchTime=" + batchTime + ", enrolled=" + enrolled + "]";
		}
		
		
		
		
}
