package ru.iroshchin.j_one.hw5;

import java.util.Random;

public class Dog extends  Animal{
    private final static int maxRun = 500;
    private final static double maxJump = 0.5;
    private final static int maxSwim = 10;

 public Dog(String name){
     super(name);
     generateFullName(name);
     generateMaxRunAbility();
     generateMaxJumpAbility();
     generateMaxSwimAbility();
 }

    private void generateFullName(String name){
        fullName = "Собачка " + name;
    }


    @Override
    public String toString() {
        return fullName +
                ", максимальная дистанция бега: " + maxRunAbility +
                " м., максимальная высота прыжка: " +  maxJumpAbility +
                " м., максимальная дистанция плаванья: " + maxSwimAbility + "м.";
    }

    //@Override
    protected void generateMaxRunAbility(){
        Random rand = new Random();
        maxRunAbility = maxRun - rand.nextInt(51);

    }

   @Override
    protected void generateMaxJumpAbility(){
        Random rand = new Random();
        double scale =  Math.pow(10,2);
        maxJumpAbility = Math.round( (maxJump - (rand.nextDouble() * 0.25)) * scale) / scale;

    }
    @Override
    protected void generateMaxSwimAbility(){
        Random rand = new Random();
        maxSwimAbility = maxSwim - rand.nextInt(4);
    }

    public void tryToRun (int distance){
        System.out.printf("Надо пробежать %s м.\n", distance );
        if (distance <= maxRunAbility)
            System.out.println(fullName + " пробежал " + distance + " м.");
        else System.out.println(fullName + "пробежал только " + maxRunAbility + " м., т.к. больше не умеет");

    }

    public void tryToJump (double height){
        System.out.printf("Надо прыгнуть на %s м.\n", height );
        if (height <= maxJumpAbility)
            System.out.println(fullName + " прыгнул на  " + height + " м.");
        else System.out.println(fullName + " прыгнул только на " + maxJumpAbility + " м., т.к. больше не умеет");
    }


    public void tryToSwim (int distance){
        System.out.printf("Надо проплыть %s м.\n", distance );
        if (distance <= maxSwimAbility)
            System.out.println(fullName + " проплыла " + distance + " м.");
        else System.out.println(fullName + " проплыла только " + maxSwimAbility + " м., т.к. больше не умеет");
    }

}
