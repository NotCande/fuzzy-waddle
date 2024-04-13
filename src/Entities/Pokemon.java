package Entities;

public abstract class Pokemon {
    protected String pokemonName;
    protected int numPokedex;
    protected char pokemonGender;
    protected double weight;

    protected abstract void tackle();
    protected abstract void scratch();
    protected abstract void nibble();

}
