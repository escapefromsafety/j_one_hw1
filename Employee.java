package ru.iroshchin.j_one.hw4;

public class Employee {
    private int empIdSequence = 0;
    private String FIO;
    private int salary;
    private int yearOfBirth;
    private int empId;


    Employee(String FIO, int salary, int yearOfBirth){
        this.FIO = FIO;
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;
        int lastUsedId = getEmpIdSequence();
        lastUsedId++;
        empId = lastUsedId;
        setEmpIdSequence(lastUsedId);

    }

    public String getFIO (){
        return FIO;
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника: " + FIO +
                "| зарплата: " + salary +
                "| год рождения: " + yearOfBirth;
    }

    public  int getYearOfBirth (){
        return  yearOfBirth;
    }

    public  int getAge(){
        return  Main.currentYear - yearOfBirth;
    }

    public void changeSalary(double changeSum){
        salary += changeSum;

    }
    public double setSalary(int newSalary){
        return  salary = newSalary;

    }


    public int getEmpIdSequence(){
        return empIdSequence;

    }


    public int getEmpId(){
        return empId;
    }

    public void setEmpIdSequence(int newValue){
        empIdSequence = newValue;
    }
}
