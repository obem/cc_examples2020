package com.company;

public class Person {
    String firstName;
    String lastName;
    String gender;
    int age;
    Person partner;
    String maidenName;
    Person[] children = new Person[5];
    private int childrenCounter = 0;

    // Constructor
    public Person(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    // Methode
    public void marry(Person personToMarry) {
        if (!this.gender.equalsIgnoreCase(personToMarry.gender)) {
            this.partner = personToMarry;
            personToMarry.partner = this;

            if (personToMarry.gender.equalsIgnoreCase("weiblich")) {
                // personToMarry is female
                personToMarry.maidenName = personToMarry.lastName;
                personToMarry.lastName = this.lastName;
            } else {
                // personToMarry is male
                this.maidenName = this.lastName;
                this.lastName = personToMarry.lastName;
            }
        }
    }

    public void divorce() {
        if (this.gender.equalsIgnoreCase("weiblich")) {
            this.lastName = this.maidenName;
            this.maidenName = "";
        } else {
            this.partner.lastName = this.partner.maidenName;
            this.partner.maidenName = "";
        }

        this.partner.partner = null;
        this.partner = null;
    }

    public void makeChild(String firstName, String lastName, String gender) {
        if (this.partner != null) {
            Person child = new Person(firstName, lastName, gender, 0);
            this.children[childrenCounter] = child;
            this.partner.children[this.partner.childrenCounter] = child;

            this.childrenCounter++;
            this.partner.childrenCounter++;
        }
    }

    public void adoptChild(Person child) {
        if (this.partner != null) {
            this.children[childrenCounter] = child;
            this.partner.children[this.partner.childrenCounter] = child;

            this.childrenCounter++;
            this.partner.childrenCounter++;
        }
    }

    public void printFamily() {
        System.out.println("Vorname: " + this.firstName);
        System.out.println("Nachname: " + this.lastName);

        System.out.println("Partner:");
        System.out.println("Vorname: " + this.partner.firstName);
        System.out.println("Nachname: " + this.partner.lastName);

        System.out.println("Kinder:");
        for (int i = 0; i < this.childrenCounter; i++) {
            Person child = this.children[i];
            System.out.println(child.firstName + " " + child.lastName);
        }
    }
}
