package ru.iroshchin.j_one.hw5;

import javax.naming.Name;
import java.rmi.Naming;
import java.util.Random;

public abstract class Animal {
    protected final String name;
    protected String fullName;
    protected double maxJumpAbility;
    protected int maxRunAbility;
    protected int maxSwimAbility;



   protected Animal(String name){
        this.name = name;
    }

    abstract void generateMaxRunAbility();
    abstract void generateMaxJumpAbility();
    abstract void generateMaxSwimAbility();




}
