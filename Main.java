package ru.iroshchin.j_one.hw5;

import com.sun.org.apache.xerces.internal.impl.dv.xs.AnyURIDV;
import ru.iroshchin.j_one.hw4.Employee;

public class Main {




    public static void main (String[] args){

    Cat c0 = new Cat("Кузя");

    Dog d0 = new Dog ("Бобик");

        System.out.println(c0.toString());
        c0.tryToRun(185);
        System.out.println();
        c0.tryToJump(1.5);
        System.out.println();
        c0.tryToSwim(5);

        System.out.println();

        System.out.println(d0.toString());
        d0.tryToRun(470);
        System.out.println();
        d0.tryToJump(0.4);
        System.out.println();
        d0.tryToSwim(8);


    }


}
