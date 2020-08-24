package ru.iroshchin.j_one.hw5;

import java.util.Random;

public class Cat extends Animal {
    private final static int maxRun = 200;
    private final static double maxJump = 2;
    private final static int maxSwimAbility = 0;

    public Cat(String name){
        super(name);
        generateFullName(name);
        generateMaxRunAbility();
        generateMaxJumpAbility();
    }


    @Override
    public String toString() {
        return fullName  +
                ", максимальная дистанция бега: " + maxRunAbility +
                " м., максимальная высота прыжка: " + maxJumpAbility + " м.";
    }

    private void generateFullName(String name){
        fullName = "Кот " + name;
    }

  //  @Override
    protected void generateMaxRunAbility(){
        Random rand = new Random();
        maxRunAbility = maxRun - rand.nextInt(51);

    }

  //  @Override
    protected void generateMaxJumpAbility(){
        Random rand = new Random();
        double scale =  Math.pow(10,1);
        maxJumpAbility = Math.round((maxJump - rand.nextDouble()) * scale)/scale ;

    }
  //  @Override
    protected void generateMaxSwimAbility(){}


    public void tryToRun (int distance){
        System.out.printf("Надо пробежать %s м.\n", distance );
        if (distance <= maxRunAbility)
            System.out.println(fullName + " пробежал " + distance + "м.");
        else System.out.println(fullName + " пробежал только " + maxRunAbility + " м., т.к. больше не умеет");

    }

    public void tryToJump (double height){
        System.out.printf("Надо прыгнуть на %s м.\n", height );
        if (height <= maxJumpAbility)
            System.out.println(fullName + " прыгнул на  " + height + " м.");
        else System.out.println(fullName + " прыгнул только на " + maxJumpAbility + " м., т.к. больше не умеет");
    }


    public void tryToSwim (int distance){
        System.out.printf("Надо проплыть %s м.\n", distance );
        System.out.println(fullName + " не умеет плавать :(");
    }
}
