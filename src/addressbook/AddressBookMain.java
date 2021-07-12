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
		return " first name:" + firstName + "\nlast name:" + lastName + "\naddress:" + address + "\ncity:" + city + "\nstate:"
				+ state + "\nemail:" + email + "\nzipcode:" + zip + "\n phone number: " + phonenumber;
	}

}

public class AddressBookMain {
	Scanner sc = new Scanner(System.in); // Scanner class
	ArrayList<AddContact> arraycontactDetails = new ArrayList<>();

	public void contactDetails() {
		AddContact contacts = new AddContact(); // object creation for AddContact class

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

		arraycontactDetails.add(contacts);
		System.out.println(arraycontactDetails);
	}

	public void edit() {

		System.out.println("Confirm your first name to edit details: ");
		String name = sc.next();

		for (int i = 0; i < arraycontactDetails.size(); i++) {
			if (arraycontactDetails.get(i).getFirstname().equals(name)) {
				System.out.println("Select form below to change: ");
				System.out.println(
						"\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
				int edit = sc.nextInt();

				switch (edit) {
				case 1:
					System.out.println("Enter first name");
					arraycontactDetails.get(i).setFirstname(sc.next());
					break;
				case 2:
					System.out.println("Enter Last name");
					arraycontactDetails.get(i).setLastname(sc.next());
					break;
				case 3:
					System.out.println("Enter address");
					arraycontactDetails.get(i).setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter city");
					arraycontactDetails.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter state");
					arraycontactDetails.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("Enter email");
					arraycontactDetails.get(i).setEmail(sc.next());
					break;
				case 7:
					System.out.println("Enter Zip");
					arraycontactDetails.get(i).setZip(sc.nextLong());
					break;
				case 8:
					System.out.println("Enter phone number");
					arraycontactDetails.get(i).setPhonenumber(sc.nextLong());
					break;
				}
				System.out.println("Edited list is: ");
				System.out.println(arraycontactDetails);

			} else
				System.out.println("Enter valid First name");
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBookMain addcontact = new AddressBookMain();
		addcontact.contactDetails();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i == 0) {
			System.out.println("What do you want:");
			System.out.println("1.Add details.\n2.Edit details.");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				addcontact.contactDetails();
				break;
			case 2:
				addcontact.edit();
				break;
			default:
				System.out.println("Wrong option");
				break;
			}
		}
	}

}
