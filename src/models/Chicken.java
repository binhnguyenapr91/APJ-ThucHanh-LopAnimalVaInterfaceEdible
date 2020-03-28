package models;

import models.Animal;
import interfaces.*;

public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat(){
        return "Chicken is edible.";
    }

    @Override
    public String makeSound() {
      return "Cuckoo!!!";
    }
}
