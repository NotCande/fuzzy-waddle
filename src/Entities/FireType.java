package Entities;

import Interfaces.iFire;

public class FireType extends Pokemon implements iFire {

    public FireType(String name) {
        pokemonName = name;
    }

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
    public void attackFirePunch() {
        System.out.println(pokemonName + " is attacking fire punch");
    }

    @Override
    public void attackFlameThrower() {
        System.out.println(pokemonName + " is attacking flame thrower");
    }

    @Override
    public void attackFireFang() {
        System.out.println(pokemonName + " is attacking fire fang");
    }
}
