package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tag {
    private String name;
    private List<Interest> interestList=new ArrayList<>();
    private List<Application>applicationList=new ArrayList<>();

    public Tag(String name) {
        this.name = name;


    }
    public void addInterest(Interest interest){
        interestList.add(interest);
    }

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                ", interestList=" + interestList +
                '}';
    }
    public void addApp(Application application){
        applicationList.add(application);
    }
}
