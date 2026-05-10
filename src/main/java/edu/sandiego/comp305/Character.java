package edu.sandiego.comp305;

public class Character extends Person{

    private double bankBalance;

    private Car car;

    private Location location;

    private Career career;

    private House house;


    public Character(final String name, final Age age,final int healthScore, final DNA dna) {
        super(name, age, healthScore, dna);
        this.bankBalance = 0.0;
    }

    public double getBankBalance(){
        return bankBalance;
    }

    public void generateDNA(){}

    public Car getCar(){
        return car;
    }

    @Override
    public Location getLocation(){
        return location;
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
