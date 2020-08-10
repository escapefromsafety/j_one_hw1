package ru.iroshchin.j_one.ht_1;

public class HomeTask1 {

    private  static double calculate(int a, int b, int c, int d){

        return a * (b + ((double) c / (double) d));
    }

    private static boolean checkRange(int a, int b){
        int sum = a + b;
        return (sum >= 10) & (sum <= 20);
    }


    private  static void checkSign (int a){

        if (a < 0)
            System.out.println("Число " + a + " является отрицательным");
        else System.out.println("Число " + a + " является положительным");

        System.out.println();
    }

    private static String generateGreeting (String name){
        return "Привет, "+ name + "!";

    }

    private static void checkLeapYear (int year){
        if ((year % 4) == 0)
            if ((year % 100) != 0)
                System.out.println("Год " + year + " является високосным");
            else if ((year % 400) == 0)
                    System.out.println("Год " + year + " является високосным");
                 else  System.out.println("Год " + year + " не является високосным");
        else System.out.println("Год " + year + " не является високосным");

    }

 //

    public static void main (String[] args){

        //Задание 1
        double calcResult;

        int a1 = 5;
        int b1 = 6;
        int c1 = 7;
        int d1 = 5;



        if (d1 == 0)
            System.out.println("Параметр d равен нулю, деление на 0 невозможно");

        else {
            calcResult = calculate(a1, b1,c1,d1 );
            System.out.println("Результат выражения a * (b + (c / d)): "
                    + calcResult);
        }

        System.out.println();

        // Задание 2
        int a2 = 15;
        int b2 = 25;

        boolean result = checkRange(a2,b2);

        if (result)
            System.out.println("Сумма чисел " + a2 + " и " + b2 +
                    " лежит в пределах от 10 до 20");

        else  System.out.println("Сумма чисел " + a2 + " и " + b2 +
                " не лежит в пределах от 10 до 20");

        System.out.println();

        //Задание 3
        int a3 = -5;
        checkSign(a3);

        System.out.println();

        //Задание 4
        String name = "Александр";
        String greeting = generateGreeting(name);
        System.out.println(greeting);

        System.out.println();

        //Задание 5

        int year = 27;
        checkLeapYear(year);


    }




}
