package edu.sandiego.comp305;

import java.util.ArrayList;

public class Child extends Person {
    @Override
    public String getLifeStage(){
        return "Child";
    }
    public ArrayList<Person> getParents(){
        return null;
    }
    public void inheritTraits(Person parent1, person parent2){
    }

}
