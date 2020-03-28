package models;
import interfaces.*;

public abstract class Fruit implements Edible {
    @Override
    public String howToEat(){
        return "Is edible.";
    };
}
