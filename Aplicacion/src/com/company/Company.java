package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
private List<Application> applicationList=new ArrayList();
private List<User>userList=new ArrayList();
private String NIF;

    public Company( String NIF) {

        this.NIF = NIF;
    }
    public void addUser(User user){
        userList.add(user);
    }
}
