package com.company;

public class Cage {
    Animal[] animals = new Animal[5];
    private int animalCounter;
    CageType type;

    public Cage(CageType type) {
        this.type = type;
    }

    public void addAnimal(Animal animal) {
        /*
         * Animals belong into a specific cage.
         * MONKEY into the WOOD_FENCE,
         * CAT into METAL
         * etc
         *
         * This is especially needed, when we add Animals with the Zoo function: addAnimal(...)
         */
        switch(type) {
            case WOOD_FENCE: {
                if (animal.species == Species.MONKEY) {
                    addAnimalToArray(animal);
                }
                break;
            }
            case METAL: {
                if (animal.species == Species.CAT) {
                    addAnimalToArray(animal);
                }
                break;
            }
            case AQUARIUM: {
                if (animal.species == Species.FISH) {
                    addAnimalToArray(animal);
                }
                break;
            }
        }
    }

    private void addAnimalToArray(Animal animal) {
        animals[animalCounter] = animal;
        animalCounter++;
    }
}
