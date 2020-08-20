package ru.iroshchin.j_one.hw4;


import java.util.Arrays;


public class Main {
    public static final int currentYear = 2020; //заменить на верх регистр


    private static Integer getEmptyPosition(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                return i;

        }
        return null;
    }


    private static void fillEmpArray(Employee[] arr, String fio, int salary, int yob) {
        Integer i = getEmptyPosition(arr);
        if (i == null){
            System.out.printf( "!!!Сотрудник %s не был добавлен в массив, т.к. не осталось пустых элементов\n", fio);
            System.out.println();
        }
        else {
            arr[i] = new Employee(fio, salary, yob);

        }
    }

    private static int getYearBoundByAge(int age){
        return currentYear - age;
    }


    private static boolean isOlderThan (Employee emp, int age){
        return emp.getAge() > age;
    }


    private static void printEmpArr(Employee[] arr) {
        for (Employee employee : arr) {

            System.out.printf("ID сотрудника:%d, ФИО сотрудника: %s, Зарплата: %d, Возраст: %d\n",employee.getEmpId(), employee.getFIO(), employee.getSalary(), employee.getAge());
        }
        System.out.println();

    }


    private static void upSalary (Employee[] arr, int ageBound, double salaryUp){
        for (Employee emp: arr){
            if(isOlderThan(emp, ageBound))
                emp.changeSalary(salaryUp);
        }

    }



   private static int getMidAge (Employee[] arr){
        int totalAge = 0;
        for (Employee emp: arr){
            totalAge += emp.getAge();
        }
        return  totalAge/arr.length;
    }

    private static int getMidSalary (Employee[] arr){
        int totalSalary = 0;
        for (Employee emp: arr){
            totalSalary += emp.getSalary();
        }
        return totalSalary/arr.length;
    }

    public static void main(String[] args) {


        Employee emp0 = new Employee("Иванов Иван Иванович", 45000, 1989);
        System.out.printf("ID сотрудника:%d, ФИО сотрудника: %s, Возраст сотрудника: %d\n",emp0.getEmpId(), emp0.getFIO(), emp0.getAge());

        System.out.println();

        Employee[] arrEmp = new Employee[5];


        fillEmpArray(arrEmp, "Иванов Иван Иванович", 30000, 1960);
        fillEmpArray(arrEmp, "Тест Петрович", 50000, 1960);
        fillEmpArray(arrEmp, "Айзеншпис Тимур", 50000, 1965);
        fillEmpArray(arrEmp, "Филипенко Артур Петрович", 65000, 1989);
        fillEmpArray(arrEmp, "Дробот Галина Геннадьевна", 40000, 1991);
        fillEmpArray(arrEmp, "Епифанова Алёна Алексеевна", 40000, 1991);



        printEmpArr(arrEmp);


        System.out.println("Сотрудники старше 40 лет:");
        for (Employee emp: arrEmp){
            if (isOlderThan(emp,40))
                System.out.println(emp.getFIO());
        }

        System.out.println();

        upSalary(arrEmp,45,5000);
        printEmpArr(arrEmp);

        System.out.println("Средний возраст сотрудников: " + getMidAge(arrEmp));
        System.out.println();

        System.out.println("Средняя зарплата сотрудников: " + getMidSalary(arrEmp));


    }


}