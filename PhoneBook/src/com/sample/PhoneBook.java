package com.sample;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {
    private PhoneBookEntry[] entries;

    public PhoneBook() {
        entries = new PhoneBookEntry[0];
    }

    public void addEntry(String name, String phone) {
        PhoneBookEntry entry = new PhoneBookEntry(name, phone);
        entries = Arrays.copyOf(entries, entries.length + 1);
        entries[entries.length - 1] = entry;
    }
    public void listEntries() {
        for (PhoneBookEntry entry : entries) {
            System.out.println("Name: " + entry.getName() + ", Phone: " + entry.getPhone());
        }
    }
    public static void main(String[] args){

        PhoneBook phoneBook=new PhoneBook();
        Scanner scanner=new Scanner(System.in);
        String  userInput;
        System.out.println("Application Started");
        System.out.println("-------------------");
        do{

            System.out.println("-------Menu--------");
            System.out.println("1. Add contact");
            System.out.println("2. Print all of your contact");
            System.out.println("Select a menu item");
            userInput=scanner.nextLine();
            switch (userInput) {
                case "1" -> {
                    System.out.println("Enter name of your contact:");
                    String userName = scanner.nextLine();
                    System.out.println("Enter PhoneNumber of your contact:");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addEntry(userName,phoneNumber);
                }
                case "2" -> {
                    phoneBook.listEntries();
                }
                case "3" ->{
                    System.out.println("The end");
                    scanner.close();
                }
                default -> System.out.println("The parameter is incorrect");
            }

        }while (!userInput.equals("3"));

    }


}