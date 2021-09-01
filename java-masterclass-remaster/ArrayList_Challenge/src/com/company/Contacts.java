package com.company;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> contactNames = new ArrayList<>();
    private ArrayList<int> phoneNumber = new ArrayList<int>();

    public void addContactName(String name){
        contactNames.add(name);
    }

    public void addPhoneNumber(int number){
        phoneNumber.add(number);
    }

    public void printContactNames(){
        System.out.print("Contacts: ");
        for(int i = 0;i<contactNames.size();i++){
            System.out.print(contactNames);
        }
    }
    public void removeContact(String contact){
        int position = findItem(contact);
        if (position >= 0){
            removeContact(position);

        }
    }

    private void removeContact(int position){
        contactNames.remove(position);
        phoneNumber.remove(position);

    }
    public void modifyContactNames(){

    }

    private void modifyContactNames(int position,String newName,int newNumber){
        contactNames.set(position,newName);
        phoneNumber.set(position,newNumber)
        System.out.println("Contact " + newName + " has been modified.");
    }

    private int findItem(String searchItem){
        return contactNames.indexOf(searchItem);
    }


}
