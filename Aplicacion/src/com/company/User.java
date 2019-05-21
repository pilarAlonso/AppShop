package com.company;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Company company;
	private List<Interest> interestList = new ArrayList();

	public User(Company company, Interest interest) {
		this.company = company;
		interestList.add(interest);
	}

	public User(Interest interest) {
		interestList.add(interest);
	}

	@Override
	public String toString() {
		return "User{" +
			   "company=" + company +
			   ", interestList=" + interestList +
			   '}';
	}
}
