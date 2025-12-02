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
	
	public boolean removeContact(String name) {
		//1 a loop to find the position of the contact in the array
		//Contact[] eles = contacts.getAll();
		for (int i = 0; i<contacts.size(); i++)
		    if
			//2 remove the contact by its position in the array 
		contacts.remove(0);
		return false;
		
		
	}
}
