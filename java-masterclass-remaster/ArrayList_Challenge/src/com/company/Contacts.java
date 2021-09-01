package com.company;

import java.util.ArrayList;

public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts createContact(String name,String phoneNumber){
        return new Contacts(name,phoneNumber);
    }











    private ArrayList<String> contactNames = new ArrayList<>();
//    private ArrayList<Integer> phoneNumber = new ArrayList<>();
//
//    public void addContactName(String name){
//        contactNames.add(name);
//    }
//
//    public void addPhoneNumber(int number){
//        phoneNumber.add(number);
//    }
//

//    public void removeContact(String contact){
//        int position = findItem(contact);
//        if (position >= 0){
//            removeContact(position);
//
//        }
//    }
//
//    private void removeContact(int position){
//        contactNames.remove(position);
//        phoneNumber.remove(position);
//
//    }
//
//    public void modifyContactNames(String currentContact,String newContact,int newNumber){
//        int position = findItem(currentContact);
//        if (position >= 0){
////            modifyContactNames(position,newContact);
//            modifyContactNames(position,newContact,newNumber);
//        } else if (!contactNames.contains(currentContact)){
//            System.out.println("Contact that needs to be modified is not found");
//        }
//
//
//    }
//
//    private void modifyContactNames(int position,String newName,int newNumber){
//        contactNames.set(position,newName);
//        phoneNumber.set(position,newNumber);
//        System.out.println("Contact " + newName + " has been modified.");
//    }
//
//    private int findItem(String searchContact){
//        return contactNames.indexOf(searchContact);
//
//    }
//
//    public boolean onFile(String searchContact) {
//        int position = findItem(searchContact);
//        if (position >= 0) {
//            return true;
//        }
//
//        return false;
//    }

}
