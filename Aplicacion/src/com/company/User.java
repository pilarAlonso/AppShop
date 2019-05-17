package com.company;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Company company;
    private List<Interest> interestList=new ArrayList();

    public User(Company company, Interest interest) {
        this.company = company;
        interestList.add(interest);
    }
}
