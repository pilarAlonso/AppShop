package com.company;

import java.util.ArrayList;
import java.util.List;

public class Category  {
    private List<Application> applicationList=new ArrayList<>();
    private String nombre;

    public Category(String nombre) {
        this.nombre = nombre;
    }
    public void addApp(Application application){
        applicationList.add(application);
    }
}
