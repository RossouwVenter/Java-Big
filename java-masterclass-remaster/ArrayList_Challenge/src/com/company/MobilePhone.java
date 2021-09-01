package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;

    private ArrayList<Contacts> contactNames ;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactNames = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contacts){
        if(findContacts(contacts.getName()) >=0){
            System.out.println("Contact is already in file");
            return false;
        }

        contactNames.add(contacts);
        return true;
    }

    public boolean updateContact(Contacts oldContact,Contacts newContact){
        int foundPosition = findContacts(oldContact);
        if(foundPosition <0) {
            System.out.println(oldContact.getName() + " ,was not found.");
            return false;
        }else if(findContacts(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists.Update is not successful.");
            return false;
        }

        this.contactNames.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+ ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contacts){
        int foundPosition = findContacts(contacts);
        if(foundPosition <0) {
            System.out.println(contacts.getName() + " ,was not found.");
            return false;
        }
        this.contactNames.remove(foundPosition);
        System.out.println(contacts.getName() + ", was deleted.");
        return true;
    }

    private int findContacts(Contacts contacts){
        return this.contactNames.indexOf(contacts);
    }

    private int findContacts(String contactName){
        for(int i = 0; i < this.contactNames.size();i++){
            Contacts contacts = this.contactNames.get(i);
            if(contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contact){
        if(findContacts(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContacts(name);
        if(position >=0){
            return this.contactNames.get(position);
        }

        return null;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for (int i = 0; i<this.contactNames.size();i++){
            System.out.println((i+1) + "." +
                    this.contactNames.get(i).getName() + " -> " +
                    this.contactNames.get(i).getPhoneNumber());
        }
    }

}
