package com.librarymanagementsystem;

import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		
		Library library = new Library();
		Scanner sc = new Scanner(System.in);
		System.out.println("+++++++++++++++++ Welcome to LibraryManagementSystem ++++++++++++++++++ ");
		int choice;
		
		do {
			System.out.println("\n--- MENU ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display All Users");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
			case 1:
				System.out.println("Enter the book ind :");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the book name :");
				String title = sc.nextLine();
				System.out.println("Enter the Book author :");
				String author = sc.nextLine();
				
				
				library.addBook(new Book(id, title, author));
				System.out.println("Book is added");
				break;
			case 2:
				System.out.println("Enter the User id :");
				int uid = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the user name :");
				String name = sc.nextLine();
				
				library.addUser(new User(uid, name));
				System.out.println("User added successfully");
				break;
			case 3:
				System.out.println("Enter the Book id :");
				int bookId = sc.nextInt();
				System.out.println("Enter the User id :");
				int userId = sc.nextInt();
				
				library.issueBook(bookId, userId);
				break;
			case 4:
				System.out.println("Enter the Book Id :");
				int rbid = sc.nextInt();
				System.out.println("Enter the User Id :");
				int ruid = sc.nextInt();
				library.returnBook(rbid, ruid);
				break;
			case 5:
				library.displayBooks();
				break;
			case 6:
				library.displayUsers();
				break;
			case 7:
				choice = 0;
				System.out.println("Exit!");
				break;
			default:
				System.out.println("Invaild operation choosen : ");
			}
		} while (choice != 0);
		
		sc.close();
	}

}
