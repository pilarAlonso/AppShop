package com.company;

import java.util.ArrayList;
import java.util.List;

public class Interest {
    private List<User> userList=new ArrayList<>();
    private String nombre;
    private List<Tag>tagList=new ArrayList<>();

    public Interest( String nombre,Tag tag) {

        this.nombre = nombre;
        this.tagList.add(tag);
    }
    public void addUser(User user){
        userList.add(user);
    }
}
