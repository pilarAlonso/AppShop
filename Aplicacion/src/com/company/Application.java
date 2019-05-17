package com.company;

import java.util.ArrayList;
import java.util.List;

public class Application {
   private List<Document>documentList;
   private Category category;
   private List<Company> companyList=new ArrayList();
   private List<Tag>tagList=new ArrayList<>();
   private String name;

    public Application(String name,Document document, Category category ) {
        documentList.add(document);
        this.category = category;
        this.name=name;

    }
    public void addTag(Tag tag){
        tagList.add(tag);
    }
}
