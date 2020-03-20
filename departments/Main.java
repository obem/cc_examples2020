package com.company;

public class Main {

    public static void main(String[] args) {
	    /*
	    Erstellen meiner Abteilungen
	                                        Vorstand
	                          /                 |                   \
	                    Einkauf              Vertrieb                Revision
	                    /       \                    \
	            Einkauf EU      Einkauf USA           Vertrieb EU
	                /
	    Einkauf Italien
	           /
	Einkauf Rom

	     */
        Department vorstand = new Department("Vorstand", "Nico", 2);
        Department einkauf = new Department("Einkauf", "Oliver", 10);
        Department vertrieb = new Department("Vertrieb", "Alfons", 8);
        Department revision = new Department("Revision", "Reinhard", 1);
        Department vertreibEuropa = new Department("Vertrieb Europa", "Heidi", 6);
        Department einkaufEuropa = new Department("Einkauf Europa", "Elke", 20);
        Department einkaufUsa = new Department("Einkauf USA", "Trump", 20);
        Department einkaufItalien = new Department("Einkauf Italien", "Martin", 15);
        Department einkaufRom = new Department("Einkauf Rom", "Antonio", 2);

        /*
        Departments untereinander zuordnen
         */
        vorstand.addSubDepartment(einkauf);
        vorstand.addSubDepartment(vertrieb);
        vorstand.addSubDepartment(revision);
        vertrieb.addSubDepartment(vertreibEuropa);
        einkauf.addSubDepartment(einkaufEuropa);
        einkauf.addSubDepartment(einkaufUsa);
        einkaufEuropa.addSubDepartment(einkaufItalien);
        einkaufItalien.addSubDepartment(einkaufRom);

        /*
        Erstellen von Mitarbeitern
         */
        Person einkaufEmp1 = new Person("Einkäufer Max");
        Person einkaufEmp2 = new Person("Einkäufer Fritz");
        Person vert1 = new Person("Vertriebler Fritz");
        Person emp3 = new Person("Antonio Roma");

        /*
        Mitarbeiter der jeweiligen Abteilung zuordnen
         */
        einkauf.addEmployee(einkaufEmp1);
        einkauf.addEmployee(einkaufEmp2);
        vertrieb.addEmployee(vert1);
        einkaufRom.addEmployee(emp3);

        /*
        Druck vom Vorstand weg
         */
        System.out.println(vorstand.name);
        vorstand.print("");
    }
}
