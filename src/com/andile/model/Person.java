package com.andile.model;

import lombok.Getter;
import org.apache.commons.lang.StringUtils;

import java.util.UUID;

@Getter
public class Person {
    private UUID id;
    private String firstName;
    private String middleName;
    private String lastName;

    private Person(UUID id, String firstName,String middleName ,String lastName){
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    public static class PersonBuilder {
        private UUID id;
        private String firstName;
        private String middleName;
        private String lastName;

        public PersonBuilder(UUID id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public PersonBuilder middleName(String middleName){
            this.middleName = middleName;
            return this;
        }
        public Person build(){
            validate();
            return new Person(id, firstName,middleName, lastName);
        }

        private void validate() {
            if(StringUtils.isEmpty(firstName) || StringUtils.isEmpty(lastName) || id == null){
                throw new IllegalArgumentException("Required parameters missing. Person must have first name, last name and id cannot be null");
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
