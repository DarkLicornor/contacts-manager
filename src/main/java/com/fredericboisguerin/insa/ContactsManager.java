package com.fredericboisguerin.insa;
import Contact;

public class ContactsManager {

    private ArrayList<Contact> contactsList = new ArrayList<Contact>();

    // public ContactsManager();

    public void addContact(String name, String email, String phoneNumber) throws InvalidEmailException, InvalidContactNameException {
      if(name.equals("") || name.equals(null)) {
        throw new InvalidContactNameException("Nom nul !");
      } else if(email.equals("") || email.equals(null)) {
        throw new InvalidEmailException("Email nul !");
      } else {
        Contact contact = new Contact(name, email, phoneNumber);
        this.contactsList.add(contact);
      }
    }

    public void printAllContacts() {
      for(Contact contact : this.contactsList) {
        printContact(contact);
      }
    }

    public void printContact(Contact contact) {
      System.out.println(contact.getName() + ", " + contact.getEmail() + ", " + contact.getPhoneNumber());
    }

    public void searchContactByName(String name) {
      for(Contact contact : this.contactsList) {
        if(contact.getName() == name) {
          printContact(contact);
        }
      }
    }
}
