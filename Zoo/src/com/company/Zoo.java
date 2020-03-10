package com.company;

public class Zoo {
    Cage[] cages = new Cage[3];
    private int cageCounter;
    String name;
    Person boss;

    public Zoo (String name, Person boss) {
        this.name = name;
        this.boss = boss;
    }

    public void addCage(Cage cage) {
        cages[cageCounter] = cage;
        cageCounter++;
    }

    /**
     * It is also possible to create the cage object within the zoo. This way,
     * it is not needed to create all objects in main. The drawback is, you also
     * do not have direct access to the cage objects.
     * @param type
     */
    public void addCage(CageType type) {
        cages[cageCounter] = new Cage(type);
        cageCounter++;
    }

    /**
     * If you choose to create the cage objects in the zoo, you will also need to
     * write a function that adds the animal to the correct cage. This is needed since
     * we do not have direct access to the cages.
     * @param animal
     */
    public void addAnimal(Animal animal) {
        // iterate through the cages to find the one with the correct cageType
        for (int i = 0; i < cages.length; i++) {
            Cage cage = cages[i];
            cage.addAnimal(animal);
        }
    }

    /**
     * Counts all animals of the zoo
     */
    public void countAnimals() {
        int animalCounter = 0;

        // iterate over all cages and their animals array to count the animals
        for (int i = 0; i < cages.length; i++) {
            Cage cage = cages[i];
            for (int j = 0; j < cage.animals.length; j++) {
                Animal animal = cage.animals[j];
                if (animal != null) {
                    animalCounter++;
                }
            }
        }
        System.out.println("We have " + animalCounter + " animals.");
    }

    /**
     * Counts each species individually
     */
    public void countSpecies() {
        // Create an array with the length of the enum Species instead of hardcoding it to e.g. 3.
        // This way, the array increases or decreases in size according to the changes of Species (a new
        // Species added or deleted)
        // Species.values() returns an array of all Species values, so we can take the .length
        int[] speciesCounter = new int[Species.values().length];

        // iterate through all cages and their animals array
        for (int i = 0; i < cages.length; i++) {
            Cage cage = cages[i];
            for (int j = 0; j < cage.animals.length; j++) {
                Animal animal = cage.animals[j];
                if (animal != null) {
                    // since the counter array is representing the Species enum, we can use the ordinal (number)
                    // of each species to increase the counter within the array
                    speciesCounter[animal.species.ordinal()]++;
                }
            }
        }

        // iterate over speciesCounter and print each counter with the species value
        for (int i = 0; i < speciesCounter.length; i++) {
            // again, Species.values() returns an array of all Species Values wit the same order
            System.out.println(Species.values()[i] + ": " + speciesCounter[i]);
        }
    }
}
