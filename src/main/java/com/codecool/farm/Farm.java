package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    List<Animal> animals = new ArrayList<>();

    public Farm(List<Animal> farm) {
        this.animals = farm;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        this.animals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        if (animals.size() > 0) {
            return false;
        }
        return true;
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Animal animal : animals) {
            result.add("There is a " + animal.getSize() + " sized " + animal.getClass() + " in the farm.");
        }
        return result;
    }
}
