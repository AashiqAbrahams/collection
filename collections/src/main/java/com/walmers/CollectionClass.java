package com.walmers;

import java.util.*;

public class CollectionClass {

    public static void main(String[] args) {



        new CollectionClass();
    }


    private static final String [] cars = {"Lambo","McLaren","Mustang"};

    public CollectionClass() {

        List<String> list = new ArrayList<>();

        for(String name : cars)
            list.add(name);

        System.out.println("My Collections List of cars are: " );

        for(int i = 0; i < list.size();i++)
            System.out.printf("%s, ", list.get(i));

        uniqueCars(list);

    }
    private void uniqueCars(Collection<String >collection){

        Set<String> set = new HashSet<>(collection);

        System.out.println("\n\n"+"My unique Set of cars are: ");

        for (String uniqueListofCars : set)

            System.out.printf("%s " + "\n\n",uniqueListofCars);

        Map colors  = new HashMap();

        colors.put("Black",5);
        colors.put("Cyan",6);
        colors.put("Yellow",7);
        colors.put("Magenta",8);

        System.out.println("\n\n" + "Total number of MAP colors: " + colors.size());

        for(Object key : colors.keySet())
            System.out.println(key + "-"+ colors.get(key));

        System.out.println();

    }

}

