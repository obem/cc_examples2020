package com.company;

import java.util.Objects;

public class Department {
    int countOfEmployees = 0;
    String name = "";
    String headOfDepartment = "";
    Person[] employees = new Person[10];
    int employeeCounter = 0;
    Department[] subDepartments = new Department[10];
    int depCounter = 0;

    public Department(String name, String headOfDepartment, int countOfEmployees) {
        this.name = name;
        this.headOfDepartment = headOfDepartment;
        this.countOfEmployees = countOfEmployees;
    }

    public void addSubDepartment(Department subDepartment) {
        subDepartments[depCounter] = subDepartment;
        depCounter++;
    }

    public void addEmployee(Person person) {
        employees[employeeCounter] = person;
        employeeCounter++;
        person.department = this;
    }

    public void print(String tabString) {
        tabString = tabString + "\t";
        for (int i = 0; i < subDepartments.length; i++) {
            if (subDepartments[i] != null) {
                System.out.println(tabString + subDepartments[i].name + "(" + subDepartments[i].headOfDepartment + ")");
                for (int j = 0; j < subDepartments[i].employees.length; j++) {
                    if (subDepartments[i].employees[j] != null) {
                        System.out.println(tabString + "+ " + subDepartments[i].employees[j].name);
                    }
                }
                subDepartments[i].print(tabString);

            }
        }
    }
}
/*
    public void printMyDeps(){
        for (int i = 0; i < subDepartments.length; i++) {
            if(subDepartments[i] != null) {
                System.out.println(subDepartments[i].name);

                for (int j = 0; j < subDepartments[i].subDepartments.length; j++) {
                    if (subDepartments[i].subDepartments[j] != null) {
                        System.out.println(subDepartments[i].subDepartments[j].name);
                        for (int k = 0; k < subDepartments[i].subDepartments[j].subDepartments.length; k++) {
                            if(subDepartments[i].subDepartments[j].subDepartments[k] != null){
                                System.out.println(subDepartments[i].subDepartments[j].subDepartments[k].name);
                            }
                        }
                    }
                }
            }
        }
    }
}*/
