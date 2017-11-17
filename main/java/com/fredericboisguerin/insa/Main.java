package com.fredericboisguerin.insa;
import java.util.Scanner;

public class Main {
    
    public static void main(String [] args)
    {
        ContactsManager cm = new ContactsManager();
        Scanner sc = new Scanner(System.in);
        String exit = "false";
        
        while (exit == "false") {
            System.out.println("What do you want to do ? (1/2/3/4)\n1) Add contact\n2)Find a contact\n3)Print all contacts\n4)Quit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Add contact : enter name");
                    String name = sc.next();
                    System.out.println("Enter email");
                    String email = sc.next();
                    System.out.println("Enter phone number");
                    String phoneNumber = sc.next();
                    try {
                        cm.addContact(name, email, phoneNumber);
                    } catch (InvalidContactNameException e) {
                        e.printStackTrace();
                    } catch (InvalidEmailException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Find a contact : enter name");
                    String nameToFind = sc.next();
                    cm.searchContactByName(nameToFind);
                    break;
                case 3:
                    System.out.println("List of contacts : ");
                    cm.printAllContacts();
                    break;
                case 4:
                    System.out.println("Are you sure you want to quit ? (y/n)");
                    String exitChoice = sc.next();
                    if (exitChoice.equals("y")) {
                        exit = "true";
                        break;
                    } else {
                        break;
                    }
                default:
                    System.out.println("Now you're not making any sense at all.");
                    break;
                    
            }
        }
        
    }
    
}
