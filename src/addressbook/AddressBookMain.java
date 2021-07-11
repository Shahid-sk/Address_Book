package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

class AddContact {
	private String firstName, lastName, address, city, state, email;
	private long zip, phonenumber;

	/* generating getters and setters for ContactInfo class */
	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	/* overriding */
	public String toString() {
		return "first name:" + firstName + "last name:" + lastName + "address:" + address + "city:" + city + "state:"
				+ state + "email:" + email + "zipcode:" + zip + "phone number:" + phonenumber;
	}

}

public class AddressBookMain {
	Scanner sc = new Scanner(System.in);
	static ArrayList<AddContact> contactarray = new ArrayList<>(); // array declaration
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
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBookMain addcontact = new AddressBookMain();
		addcontact.contactDetails();
	}

}
