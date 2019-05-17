package com.company;

import java.util.ArrayList;
import java.util.List;

public class Document {
    List<Application> applicationList=new ArrayList<>();
    private String name;


    public Document(String name) {
        this.name = name;
    }
    public void addApplication(Application application){
        applicationList.add(application);
    }
}
