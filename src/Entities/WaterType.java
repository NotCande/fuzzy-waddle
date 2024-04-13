package Entities;

import Interfaces.iWater;

public class WaterType extends Pokemon implements iWater{

    public WaterType(String name) {
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
    public void attackWaterPulse() {
        System.out.println(pokemonName + " is attacking water pulse");
    }

    @Override
    public void attackBubble() {
        System.out.println(pokemonName + " is attacking bubble");
    }

    @Override
    public void attackWaterGun() {
        System.out.println(pokemonName + " is attacking water gun");
    }
}
