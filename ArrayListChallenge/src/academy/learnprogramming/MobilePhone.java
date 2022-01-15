package academy.learnprogramming;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            return false;
        }

        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(findContact(oldContact) < 0) {
            return false;
        } else {
            this.myContacts.set(findContact(oldContact), newContact);
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        if(findContact(contact) < 0) {
            return false;
        } else{
            this.myContacts.remove(findContact(contact));
            return true;
        }
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(name)) {
                return this.myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
