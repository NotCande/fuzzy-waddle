package Entities;

/**First polymorphism practice I do
 * @author Copied from https://www.youtube.com/watch?v=O3hKxRLkLVU&list=PLQxX2eiEaqbwNP20GMMCjRslRq2lOLWlg&index=11&ab_channel=TodoCode*/
public class Main {
    public static void main(String[] args) {
        GrassType bulbasaur = new GrassType("Bulbasaur");
        ElectricType pikachu = new ElectricType("Pikachu");
        WaterType squirtle = new WaterType("Squirtle");
        FireType charmander = new FireType("Charmander");

        bulbasaur.scratch();
        bulbasaur.attackGigaDrain();
        System.out.println();

        pikachu.scratch();
        pikachu.attackThunderPunch();
        System.out.println();

        squirtle.scratch();
        squirtle.attackBubble();
        System.out.println();

        charmander.scratch();
        charmander.attackFireFang();
    }
}