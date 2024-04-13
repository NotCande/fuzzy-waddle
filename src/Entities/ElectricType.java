package Entities;

import Interfaces.iElectric;

public class ElectricType extends Pokemon implements iElectric{

    public ElectricType(String name) {
        pokemonName = name;
    }

    protected void tackle() {
        System.out.println(pokemonName + " is attacking  tackle");
    }

    @Override
    protected void scratch() {
        System.out.println(pokemonName + " is attacking scratch");
    }

    @Override
    protected void nibble() {
        System.out.println(pokemonName + " is attacking nibble");
    }

    @Override
    public void attackThunderShock() {
        System.out.println(pokemonName + " is attacking hock");
    }

    @Override
    public void attackThunderPunch() {
        System.out.println(pokemonName + " is attacking punch");
    }
}
