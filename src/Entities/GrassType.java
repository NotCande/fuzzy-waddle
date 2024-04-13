package Entities;

import Interfaces.iGrass;

public class GrassType extends Pokemon implements iGrass{

    public GrassType(String name) {
        pokemonName = name;
    }

    @Override
    protected void tackle() {
        System.out.println(pokemonName + " is attacking tackle");
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
    public void attackGigaDrain() {
        System.out.println(pokemonName + " is attacking giga drain");
    }

    @Override
    public void attackSleepPowder() {
        System.out.println(pokemonName + " is attacking sleep powder");
    }
}
