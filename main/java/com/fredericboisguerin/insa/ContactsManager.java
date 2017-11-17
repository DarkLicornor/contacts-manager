package com.fredericboisguerin.insa;

import java.util.ArrayList;


public class ContactsManager {

    private ArrayList<Contact> contactsList = new ArrayList<Contact>();

    public void addContact(String name, String email, String phoneNumber) throws InvalidEmailException, InvalidContactNameException {
      if(name == null || name.equals("")) {
        throw new InvalidContactNameException("Nom nul !");
      } else if(email != null && !email.contains("@")) {
        throw new InvalidEmailException("Email nul !");
      } else {
        Contact contact = new Contact(name, email, phoneNumber);
        this.contactsList.add(contact);
      }
    }

    public void printAllContacts() {
        for(int i = 0; i<this.contactsList.size(); i++) {
            System.out.println(this.contactsList.get(i).toString());
        }
      }

    public void searchContactByName(String name) {
        for (int i = 0; i < this.contactsList.size(); i++) {
            if (this.contactsList.get(i).getName().toUpperCase().contains(name.toUpperCase())) {
                System.out.println(this.contactsList.get(i).toString());
            }
        }
    }
}
