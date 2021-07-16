package addressbook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class AddressBookMain {
	Scanner sc = new Scanner(System.in); // Scanner class
	String Name;
	public static ArrayList<AddContact> arraycontactDetails = new ArrayList<>();
	static HashMap<String, ArrayList<AddContact>> hashmap = new HashMap<>();
	static AddressBookMain userDetails = new AddressBookMain();

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
					System.out.println("Enter first name \n");
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

	public void deletecontact() {
		System.out.println("Confirm your first name to delete contact");
		String confirmName = sc.next();
		for (int i = 0; i < arraycontactDetails.size(); i++) {

			if (arraycontactDetails.get(i).getFirstname().equals(confirmName)) {

				arraycontactDetails.remove(i);
			} else {
				System.out.println("Enter valid first name");
				break;
			}
			System.out.println("contact details deleted");
			System.out.println(arraycontactDetails);
		}

	}

	public void createAddressBook() {

		while (true) {
			System.out.println("Choose what you want to do: ");
			System.out.println(
					"1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.exit");
			int choose = sc.nextInt();

			if (choose == 4) {
				System.out.println("Exited");
				break;
			}

			switch (choose) {
			case 1:
				System.out.println("Enter the name of address book: ");
				String address_name = sc.next();

				// condition to check for uniqueness of address book.
				if (hashmap.containsKey(address_name)) {
					System.out.println("Adress book name exits, enter different name");
					break;
				}

				ArrayList<AddContact> new_address_book = new ArrayList<>();
				arraycontactDetails = new_address_book;
				while (true) {
					System.out.println("Choose what you want to do: ");
					System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
					int choose1 = sc.nextInt();
					if (choose1 == 4) {
						System.out.println("Exited");
						break;
					}
					switch (choose1) {
					case 1:
						userDetails.contactDetails();
						break;
					case 2:
						userDetails.edit();
						break;
					case 3:
						userDetails.deletecontact();
						break;
					default:
						System.out.println("Choose valid option");
						break;
					}
					hashmap.put(address_name, arraycontactDetails);
					System.out.println(hashmap);
				}
				break;

			case 2:
				System.out.println("Enter the name of address book: ");
				String address_name_old = sc.next();

				// condition to check whether address book exists or no.
				if (hashmap.containsKey(address_name_old)) {

					ArrayList<AddContact> old_address_book = new ArrayList<>();
					arraycontactDetails = old_address_book;
					arraycontactDetails = hashmap.get(address_name_old);
					while (true) {
						System.out.println("Choose what you want to do: ");
						System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
						int choose1 = sc.nextInt();
						if (choose1 == 4) {
							System.out.println("Exited");
							break;
						}
						switch (choose1) {
						case 1:
							userDetails.contactDetails();
							break;
						case 2:
							userDetails.edit();
							break;
						case 3:
							userDetails.deletecontact();
							break;
						default:
							System.out.println("Choose valid option");
							break;
						}
						hashmap.put(address_name_old, arraycontactDetails);
						System.out.println(hashmap);
					}
				} else {
					System.out.println("Enter valid address book name");
				}
				break;

			case 3:
				System.out.println(hashmap);
				break;

			default:
				System.out.println("Enter valid option");

			}

		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		userDetails.createAddressBook();
	}
}