package com.celcom.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment3 {
	private static final String FILE_PATH = "D://Java Workspace//MyJavaProject//src//com//celcom//day9//ObjectFile.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		HashMap<Integer, Task> tasks = loadTasks();
		TaskManager taskManager = new TaskManager(tasks);
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to Task Manager");
			System.out.println("Choose an Option Below");
			System.out.println(
					"1.Add a new task	\r\n" + "2.View all tasks\r\n" + "3.Mark a task as completed or Incomplete\r\n"
							+ "4.Delete a task\r\n" + "5.Search for tasks\r\n" + "6.Exit ");
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				taskManager.addTask();
				break;
			case 2:
				taskManager.displayTask();
				break;
			case 3:
				taskManager.taskStatus();
				break;
			case 4:
				taskManager.deleteTask();
				break;
			case 5:
				taskManager.searchTask();
				break;
			default:
				saveTasks(tasks);
				System.out.println("Thank you for using task Manager");
				in.close();
				return;
			}
		}
	}

	private static HashMap<Integer, Task> loadTasks() {
		File file = new File(FILE_PATH);
		if (file.exists() && file.length() > 0) {
			try {
				FileInputStream fileStream = new FileInputStream(file);
				ObjectInputStream objectStream = new ObjectInputStream(fileStream);
				return (HashMap<Integer, Task>) objectStream.readObject();
			}

			catch (ClassNotFoundException | IOException e) {
				System.out.println("The New List is created");
			}
		}
		return new HashMap<>();

	}

	private static void saveTasks(HashMap<Integer, Task> tasks) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
			objectOutputStream.writeObject(tasks);
		} catch (IOException e) {
			System.out.println("Error is saving Object");
		}
	}
}
