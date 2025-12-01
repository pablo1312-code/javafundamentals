package oopmodeling.addressbook;
/**
 * This class is in charge of administration of 
 * a group of contacts.
 * @author panblo
 * 26 nov 2025
 */

import java.util.Scanner;

import datastrcture.FlexibleArray; 
/**
 * This class is used to manage a list of contact objects 
 * @author panblo
 * 28 nov 2025
 */


public class AddressBook {
	
	//Atributes 
	//This is the container for the list of contact objects 
	protected FlexibleArray<Contact> contacts;
	
	protected Scanner scanner; 
	
	public AddressBook() {
		contacts = new FlexibleArray<Contact>();
	}
	//behaves 
	public void showContacts() {
	
	}
	
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	
	public void removeContact(String name) {
		
	}
}
