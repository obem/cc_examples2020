package com.company;

public class Main {

    public static void main(String[] args) {
	    Person me = new Person("Michael", "Troy", "männlich", 26);
	    Person claudia = new Person("Claudia", "Musterfrau", "weiblich", 25);
		Person stefanie = new Person("Stefanie", "Musterfrau", "männlich", 25);

	    claudia.marry(stefanie);

	    me.makeChild("Mike Jr", "Troy", "männlich");
	    me.makeChild("Susanne", "Troy", "weiblich");

	    Person child = new Person ("Paul", "Troy", "männlich", 5);
	    me.adoptChild(child);

	    me.printFamily();

	    me.divorce();
    }
}
