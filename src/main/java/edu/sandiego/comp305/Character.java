package edu.sandiego.comp305;

public class Character extends Person{


    private Car car;

    private Location location;

    private Career career;

    private House house;


    public Character(final String name, final Age age,final int healthScore, final DNA dna, final double bankBalance) {
        super(name, age, healthScore, dna, bankBalance);
    }


    public void generateDNA(){}

    public Car getCar(){
        return car;
    }

    public House getHouse() {
        return house;
    }

    public Career getCareer(){
        return career;
    }

    public void chooseCareer(final Career career){
        this.career = career;
    }


    public void chooseLocation(final Location location){
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }

    public void buyCar(final Car car){
        this.car = car;
    }

    public void buyHouse(final House house) {
        this.house = house; }

    @Override
    public String getLifeStage(){
        return "Character";
    }
}
