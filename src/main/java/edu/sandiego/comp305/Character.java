package edu.sandiego.comp305;

import java.util.ArrayList;
import java.util.List;

public class Character extends Person{

    private Car car;

    private Location location;

    private Career career;

    private House house;

    private List<Insurable> insurables;

    public Character(final String name, final Age age, final int healthScore, final DNA dna, final double bankBalance) {
        super(name, age, healthScore, dna, bankBalance);
        this.insurables = new ArrayList<>();
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

    public List<Insurable> getInsurables() {
        return new ArrayList<>(insurables);
    }

    public void chooseCareer(final Career career){
        this.career = career;
    }


    public void chooseLocation(final Location location){
        this.location = location;
    }


    public void buyCar(final Car car){
        this.car = car;
        this.insurables.add(car);
    }

    public void buyHouse(final House house) {
        this.house = house;
        this.insurables.add(house);
    }

    public void calculateBankBalance(){
        if (career != null) {
            setBankBalance(getBankBalance() + career.salary);
        }
    }


    public Phenotype getPhenotype(){
        return new Phenotype(
                getDna().calculatePhenotypeFromAllele(Allele.EYE_COLOR),
                getDna().calculatePhenotypeFromAllele(Allele.HEIGHT),
                getDna().calculatePhenotypeFromAllele(Allele.HAIR_COLOR));
    }


    @Override
    public String getLifeStage(){
        return "Character";
    }
}
