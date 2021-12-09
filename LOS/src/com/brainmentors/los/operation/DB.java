package com.brainmentors.los.operation;

import java.util.ArrayList;

import com.brainmentors.los.customer.Customer;
import com.brainmentors.los.customer.PersonalInformation;

public class DB {

	public static ArrayList<Customer> getNegativeCustomers()
	{
		ArrayList<Customer> negativeCustomers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setId(1010);
		PersonalInformation pd = new PersonalInformation();
		pd.setFirstName("Tim");
		pd.setLastName("Jackson");
		pd.setPhone("8327698767");
		pd.setPanCard("BW10000");
		pd.setVoterId("A111");
		pd.setEmail("tim@gmail.com");
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
			
		customer = new Customer();
		customer.setId(1011);
		pd = new PersonalInformation();
		pd.setFirstName("Tom");
		pd.setLastName("Dahl");
		pd.setPhone("8327678767");
		pd.setPanCard("BN10000");
		pd.setVoterId("A105");
		pd.setEmail("tom@gmail.com");
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		
		return negativeCustomers;
		
	}
	
}
