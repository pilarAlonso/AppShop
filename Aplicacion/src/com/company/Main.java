package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Application> applicationList = new ArrayList<>();
        List<User> userList = new ArrayList<>();
        List<Company> companyList = new ArrayList<>();
        Tag tag2=new Tag("lectura");
        Interest interest2=new Interest("libros",tag2);
        tag2.addInterest(interest2);
		Tag tag = new Tag("juegosDeOcio");
		Interest interest1 = new Interest("juegos", tag);
		tag.addInterest(interest1);
        Document document1 = new Document("documento1");
        Category category1 = new Category("ocio");
        Application application1 = new Application("aplicacion1", document1, category1, 45);
        document1.addApplication(application1);
        category1.addApp(application1);
        User owner1=new User(interest1);
        Company company = new Company("BE1234543",owner1);
        company.addApplicat(application1);

        User user1 = new User(company, interest1);
        interest1.addUser(user1);
        company.addUser(user1);
        interest1.addTag(tag);
        companyList.add(company);
        application1.addTag(tag);
        application1.addCompany(company);
        applicationList.add(application1);
        Category category2 = new Category("arte");
        Application application2 = new Application("arte", document1, category2, 23);
        applicationList.add(application2);
        category2.addApp(application2);
        User owner2=new User(interest2);
        Company company2 = new Company("be12345443",owner2);
        company.addApplicat(application2);
        application2.addCompany(company2);
        companyList.add(company2);
        company2.addApplicat(application2);
        System.out.println("numero de app con la categoria ocio");
        Long number = applicationList
                .stream()
                .filter(application -> application.getCategory().getNombre().equalsIgnoreCase("ocio"))
                .map(application -> application.getCategory()
                                     ).count();
        System.out.println(number);

        System.out.println("listado de aplicaciones con categoria ocio");
        Stream<Application> list = applicationList.stream().filter(application -> application.getCategory().getNombre().equalsIgnoreCase("ocio"));
        list.forEach(System.out::println);
        System.out.println("listar aplicaciones por categoria");
        System.out.println(applicationList.stream().collect(Collectors.groupingBy(Application::getCategory)));
        System.out.println("numero de aplicaciones compradas por cada cliente");
        companyList.forEach(company1 -> System.out.println(company1.getNIF() + "numero" + (company1.getApplicationList().size())));
        System.out.println("numero  de aplicaciones vendidas");
        companyList.forEach(company1 -> company1.getApplicationList().size());
        System.out.println(applicationList.stream().filter(application -> application.getCompanyList().size() > 0).count());
        System.out.println("numero de app de ocio vendidas");
        System.out.println(applicationList.stream().filter(application -> application.getCategory().getNombre().equalsIgnoreCase("ocio")).filter(application -> application.getCompanyList().size() > 0).count());
        System.out.println("coste total de app vendidas");
        System.out.println(applicationList.stream().filter(application -> application.getCompanyList().size() > 0).mapToInt(application -> application.getPrice()).sum());
        System.out.println("cliente que mas dinero se ha gastado");
        Comparator<Company> comparador1 = (p1, p2) -> Double.compare(p1.totalPrice(), p2.totalPrice());
        Company maxi = companyList.stream()
                                  .max(comparador1)
                                  .get();
        System.out.println(maxi);


        System.out.println("cliente que mas se ha gastado");
        String companyWaste = (companyList

                .stream()

                .max(Comparator.comparingInt(company1 -> company1.getApplicationList()

                                                                .stream()

                                                                .mapToInt(Application::getPrice).sum()))

                .get().getNIF());

        System.out.println(companyWaste);

    }
    }

