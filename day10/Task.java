package com.celcom.day10;

import java.io.Serializable;

public class Task implements Serializable{
		/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
		private String taskName;
		private boolean status;

		
		Task(String taskName, boolean status) {
			this.taskName = taskName;
			this.status = status;
		}
		
		
		
		public String getTaskName() {
			return taskName;
		}



		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}



		public boolean isStatus() {
			return status;
		}



		public void setStatus(boolean status) {
			this.status = status;
		}



		@Override
		public String toString() {
			return "Task [taskName=" + taskName + ", status=" + status + "]";
		}
		
}
