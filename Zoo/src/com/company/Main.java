package com.company;

public class Main {

    public static void main(String[] args) {
        Person boss = new Person("Paul", "Rüdiger");
        Zoo zoo = new Zoo("Berliner Zoo", boss);

        Cage monkeyCage = new Cage(CageType.WOOD_FENCE);
        Cage aquarium = new Cage(CageType.AQUARIUM);
        Cage lionCage = new Cage(CageType.METAL);

        zoo.addCage(monkeyCage);
        zoo.addCage(aquarium);
        zoo.addCage(lionCage);

        Animal simba = new Animal("Simba", Species.CAT);
        Animal koko = new Animal("Koko", Species.MONKEY);
        Animal nemo = new Animal("Nemo", Species.FISH);

        monkeyCage.addAnimal(koko);
        aquarium.addAnimal(nemo);
        lionCage.addAnimal(simba);

        zoo.countAnimals();
        zoo.countSpecies();
    }
}
