package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private List<Application> applicationList = new ArrayList<>();
	private List<User> userList = new ArrayList<>();
	private User owner;
	private String NIF;

	public int totalPrice() {
		int price = applicationList.stream().mapToInt(application -> application.getPrice()).sum();
		return price;

	}

	public Company(String NIF, User owner) {
		this.owner = owner;

		this.NIF = NIF;
	}

	public void addUser(User user) {
		userList.add(user);
	}

	public void addApplicat(Application application) {
		applicationList.add(application);
	}

	@Override
	public String toString() {
		return "Company{" +

			   ", NIF='" + NIF + '\'' +
			   '}';
	}

	public List<Application> getApplicationList() {
		return applicationList;
	}

	public String getNIF() {
		return NIF;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
}
