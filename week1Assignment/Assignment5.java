package com.celcom.week1Assignment;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
	String title;
	String author;
	long ISBN;
	Book(String title,String author,long ISBN){
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	void display(int bookNumber) {
		
		System.out.println("Book Number : "+ (bookNumber+1));
		System.out.println("Book Name :" + title);
		System.out.println("Book Author : " + author);
		System.out.println("Book ISBN : "+ ISBN);
	}
	
}

public class Assignment5 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Book> bookCollection=new ArrayList<>();
		while(true) {
			System.out.println("Enter any option \n 1.Add Book \n 2.Remove Book\n 3.Display Books\n 4.Exit");
			int n=in.nextInt();
			in.nextLine();
			if(n==1) {
				//Book Insertion
				System.out.print("Enter the Name : ");
				String name=in.nextLine();
				System.out.print("Enter the Author : ");
				String author=in.nextLine();
				System.out.print("Enter the ISBN : ");
				Long ISBN=in.nextLong();
				in.nextLine();
				bookCollection.add(new Book(name,author,ISBN));
				
			}
			else if(n==2){
				//Book Deletion
				System.out.println("Enter the books ISBN which you need to be removed");
				long ISBN=in.nextLong();
				bookCollection.removeIf(book->book.ISBN==ISBN);
			}
			else if(n==3) {
				for(int i=0;i<bookCollection.size();i++) {
					//Book Display
					bookCollection.get(i).display(i);
					
				}
			}
			else {
				in.close();
				return;
			}
		}
	}

}