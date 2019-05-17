package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tag {
    private String name;
    private List<Interest> interestList=new ArrayList<>();

    public Tag(String name) {
        this.name = name;

    }
    public void addInterest(Interest interest){
        interestList.add(interest);
    }
}
