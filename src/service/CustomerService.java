package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;

public class CustomerService {
	private Map<String, Customer> customerMap;

	public CustomerService() {
		customerMap = new HashMap<String, Customer>();

		addCustomer(new Customer("id001", "alice"));
		addCustomer(new Customer("id002", "bob"));
		addCustomer(new Customer("id003", "charlie"));
		addCustomer(new Customer("id004", "daniel"));
		addCustomer(new Customer("id005", "trudy"));

	}

	private void addCustomer(Customer customer) {

		customerMap.put(customer.getId(), customer);

	}

	public Customer findCustomer(String id, String PWD) {

		if (id != null && customerMap.get(id.toLowerCase()) != null) {
			if (customerMap.get(id.toLowerCase()).getPWD().equals(PWD))
				return (customerMap.get(id.toLowerCase()));
			else {  //비밀번호 틀렸을때				
				return null;
			}
		} else
			return null;

	}

	public List<Customer> getAllCustomers() {
		List<Customer> customerList = new ArrayList<Customer>(customerMap.values());

		return customerList;
	}

}
