package com.celcom.day10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class TaskManager {
	HashMap<Integer, Task> tasks;
	static Scanner in = new Scanner(System.in);
	static int taskCount;

	TaskManager(HashMap<Integer, Task> tasks) {
		this.tasks = tasks;
		taskCount = tasks.size();

	}

	void addTask() {
		System.out.println("Enter the Task :");
		String taskName = in.nextLine();
		tasks.put(taskCount++, new Task(taskName, false));
	}

	void deleteTask() {
		System.out.println("Enter the number of the Task to get removed :");
		int taskNumber = in.nextInt();
		tasks.remove(taskNumber);
		HashMap<Integer, Task> tempTasks = new HashMap<>();
		tasks.forEach((tempTaskNum, tempTask) -> {
			if (taskNumber < tempTaskNum)
				tempTasks.put(tempTaskNum - 1, tempTask);
			else
				tempTasks.put(tempTaskNum, tempTask);

		});
		tasks = tempTasks;
	}

	void taskStatus() {
		System.out.println("Enter the number of the Task to change status :");
		int taskNumber = in.nextInt();
		System.out.println("To mark task as complete \n Press 1 \n To mark task as incomplete \n Press2");
		int status = in.nextInt();
		switch (status) {
		case 1:
			tasks.get(taskNumber).setStatus(true);
			break;
		case 2:
			tasks.get(taskNumber).setStatus(false);
		}

	}

	void searchTask() {
		System.out.println("Enter Name or Number to be searched");
		String search = in.nextLine();
		int num = 0;
		try {
			num = Integer.parseInt(search);
			System.out.println("The task you searched for is :");
			System.out.println("Task Name : " + tasks.get(num).getTaskName());
			System.out.println("Status : " + (tasks.get(num).isStatus() ? "Completed" : "Not Completed"));
		} catch (Exception e) {
			tasks.forEach((taskNumber, task) -> {
				if (task.getTaskName().equalsIgnoreCase(search)) {
					System.out.println("Task Number : " + taskNumber + "\n" + "Task Name : " + task.getTaskName() + "\n"
							+ "Task Status : " + ((task.isStatus()) ? "Completed" : "Not Completed"));
				}
			});
		}
	}

	void displayTask() {
		tasks.forEach((taskNumber, task) -> {
			System.out.println("Task Number : " + taskNumber + "\n" + "Task Name : " + task.getTaskName() + "\n"
					+ "Task Status : " + ((task.isStatus()) ? "Completed" : "Not Completed" + "\n"));
		});
		System.out.println();
	}
}
