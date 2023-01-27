package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class LockedMeAssignment {

	public static void main(String[] args) {
		// Step 1 : Welcome Screen and Developer name 
		
	
		
		System.out.println("Application Name: Locked Me");
		System.out.println("Developer Name: Stelio Portugal");
		
		// Step 2 : User Interface and User choice
		
		while (true) {
			
			boolean exit = false;
			
			
			System.out.println("Main Menu");
			System.out.println("---------------------");
			System.out.println("1. File Management");
			System.out.println("2. List files");
			System.out.println("3. Close Application");
			System.out.println("---------------------");
			
			System.out.println("What would you like to do? ");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			
			
			switch (choice) {
			case 1: 
				manageFiles();
				break;
			case 2:
				listFiles();
				break;
			case 3:
				System.out.println("Closing Application");
				return;
			default:
				System.out.println("Invalid Choice. Please choose from presented list.");	
					
			
			}
		

	
			}
		}

	// Step 3 - List Files in ascending order
	
	private static void listFiles() {
		// TODO Auto-generated method stub
		
		File root = new File(".");
        String[] fileList = root.list();

        ArrayList<String> files = new ArrayList<>();
        for (String file : fileList) {
            if (new File(file).isFile()) {
                files.add(file);
        }
	}
        
        Collections.sort(files, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Files in ascending order:");
        for (String file : files) {
            System.out.println(file);
        }
        System.out.println("1. Return to main menu");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
        if(choice == 1)
        return;
	}
	private static void manageFiles() {
		// TODO Auto-generated method stub
		
		while (true) {
			 	System.out.println("File Management:");
			 	System.out.println("-------------------");
	            System.out.println("1. Add a file");
	            System.out.println("2. Delete a file");
	            System.out.println("3. Search for a file");
	            System.out.println("4. Main menu");
	            System.out.println("-------------------");

	            System.out.print("Enter your choice: ");
	            Scanner scanner = new Scanner(System.in);
	            int choice = scanner.nextInt();
	            
	            switch (choice) {
	            case 1:
                    System.out.print("Enter the name of the file to add: ");
                    String filePath = ".txt";
                    String fileName = scanner.next();
                    File file = new File(fileName + filePath);
                    File directory = new File("files");
                    directory.mkdir();
                    
                    try {
                        if (file.createNewFile()) {
                            System.out.println("File added: " + fileName + "\n");
                        } else {
                            System.out.println("Failed to add file: " + fileName + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
	            case 2:
	            	String filePath1 = "path/to/file.txt";
	                File file1 = new File(filePath1);
	                
	                // Check if the file exists
	                if(file1.exists()) {
	                    // Attempt to delete the file
	                    boolean isDeleted = file1.delete();
	                    if(isDeleted) {
	                        System.out.println("File deleted successfully");
	                    } else {
	                        System.out.println("Failed to delete the file");
	                    }
	                } else {
	                    System.out.println("File not found");
	                }
	               
	            	
	            	
	                break;
	            case 3:
	                // option 3 functionality
	                break;
	            case 4:
	                return;
	            default:
	                System.out.println("Invalid option. Please try again.");
	                break;
	            }
    }
	}


	}
		
		
	
