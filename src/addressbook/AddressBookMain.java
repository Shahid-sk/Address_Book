package addressbook;

import java.util.Scanner;

public class AddressBookMain {
	Scanner sc = new Scanner(System.in);
	AddContact contacts = new AddContact(); // object creation for AddContact class

	public void contactDetails() {

		System.out.println("Enter first name:");
		contacts.setFirstname(sc.nextLine());
		System.out.println("Enter last name:");
		contacts.setLastname(sc.nextLine());
		System.out.println("Enter State:");
		contacts.setState(sc.nextLine());
		System.out.println("Enter city:");
		contacts.setCity(sc.nextLine());
		System.out.println("Enter address:");
		contacts.setAddress(sc.nextLine());
		System.out.println("Enter email:");
		contacts.setEmail(sc.nextLine());
		System.out.println("Enter zip code:");
		contacts.setZip(sc.nextLong());
		System.out.println("Enter phone number:");
		contacts.setPhonenumber(sc.nextLong());
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBookMain addcontact = new AddressBookMain();
		addcontact.contactDetails();
	}

}
