package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Application> applicationList=new ArrayList<>();
        List<User> userList=new ArrayList<>();

        Document document1=new Document("documento1");
        Category category1=new Category("ocio");
        Application application1=new Application("aplicacion1",document1,category1);
        document1.addApplication(application1);
        category1.addApp(application1);
        Company company=new Company("BE1234543");
        Tag tag=new Tag("juegosDeOcio");
        Interest interest1=new Interest("juegos",tag);
        tag.addInterest(interest1);
        User user1=new User(company,interest1);
        interest1.addUser(user1);
        company.addUser(user1);
    }
}
