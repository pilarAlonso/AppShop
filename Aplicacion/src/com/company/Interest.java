package com.company;

import java.util.ArrayList;
import java.util.List;

public class Interest {
    private List<User> userList=new ArrayList<>();
    private String nombre;
    private List<Tag>tagList=new ArrayList<>();

    @Override
    public String toString() {
        return "Interest{" +

                ", nombre='" + nombre + '\'' +

                '}';
    }

    public Interest(String nombre, Tag tag) {

        this.nombre = nombre;
        this.tagList.add(tag);
    }
    public void addUser(User user){
        userList.add(user);
    }
    public void addTag(Tag tag){
        tagList.add(tag);
    }
}
