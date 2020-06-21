package cell_phone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CellPhone cellPhone = new CellPhone("123 456 7890");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    cellPhone.quit();
                    quit = true;
                    break;
                case 1:
                    cellPhone.showContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.saveContact(name, phone);
        if(cellPhone.addContact(newContact)) {
            System.out.println("New contact added: " + name + " -> " + phone);
        } else {
            System.out.println("Cannot add, " + name + " is already on file.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord =  cellPhone.searchContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: (leave blank if you do not wish to change the number)");
        String newNum = scanner.nextLine();
        // allow users to change only the name by leaving the phone number field blank
        Contact newContact;
        if(newNum.equals("")) {
            newContact = Contact.saveContact(newName, existingContactRecord.getPhoneNumber());
        } else {
            newContact = Contact.saveContact(newName, newNum);
        }
        if(cellPhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated contact");
        } else {
            System.out.println("Error updating contact");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord =  cellPhone.searchContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if(cellPhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted contact");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void searchContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord =  cellPhone.searchContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + "\nPhone number: " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shut down\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - to search for existing contact\n" +
                           "6 - to print a list of available actions\n");
        System.out.println("Choose your action: ");
    }
}
