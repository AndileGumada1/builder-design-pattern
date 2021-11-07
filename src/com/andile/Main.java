package com.andile;

import com.andile.model.Person;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
	Person andile = new Person
            .PersonBuilder(null,"Andile","Gumada")
            .middleName("Andy")
            .build();
        System.out.println(andile);

        Person shane = new Person
                .PersonBuilder(UUID.randomUUID(),"Shane","Parker")
                .build();
        System.out.println(shane);
    }
}
