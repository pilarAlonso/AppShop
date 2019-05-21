package com.company;

import java.util.ArrayList;
import java.util.List;

public class Application {
	private int price;
	private Document document;
	private Category category;
	private List<Company> companyList = new ArrayList();
	private List<Tag> tagList = new ArrayList<>();
	private String name;

	public int getPrice() {
		return price;
	}

	public Application(String name, Document document, Category category, int price) {

		this.category = category;
		this.name = name;
		this.price = price;

	}

	public void addTag(Tag tag) {
		tagList.add(tag);
	}

	public Category getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Application{" +
			   ", category=" + category +
			   ", name='" + name + '\'' +
			   '}';
	}

	public void addCompany(Company company) {
		companyList.add(company);
	}

	public List<Company> getCompanyList() {
		return companyList;
	}

}
