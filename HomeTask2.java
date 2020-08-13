
package ru.iroshchin.j_one.hw1;

import java.util.Arrays;

public class HomeTask2 {

    private static void convertZeroToOne(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (arr[i] == 0) ? 1 : 0;
    }


    private static void fillArray(int[] arr) {
        int a = -2;
        for (int i = 0; i < arr.length; i++) {
            a += 3;
            arr[i] = a;
        }
    }


    private static void multiplyArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? (arr[i] * 2) : arr[i];
        }
    }


    private static int getArrayMaxNumber(int[] arr) {
        int maxNumber = arr[0];
        for (int i : arr) {
            if (i > maxNumber)
                maxNumber = i;
        }
        return maxNumber;
    }


    private static int getArrayMinNumber(int[] arr){
        int minNumber = arr[0];
        for (int i : arr) {
            if (i < minNumber)
                minNumber = i;
        }
        return minNumber;
   }

    private static boolean isBalanced(int[] arr){
        int countL = 0;
        int countR = 0;
        for (int i = 0; i < (arr.length - 1); i++){
            countL += arr[i];
            for(int a = (i+1); a < arr.length; a++){
                countR += arr[a];
            }
            if (countL == countR) break;
            else countR = 0;
        }
        return (countL == countR);
    }



        public static void main (String[] args){

            //Задание 1
            int[] zeroOneArr = {0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1};
            System.out.println("Исходный массив: " + Arrays.toString(zeroOneArr));
            convertZeroToOne(zeroOneArr);
            System.out.println("Массив после обработки методом для задания 1: " + Arrays.toString(zeroOneArr));

            System.out.println();

            //Задание 2
            int[] emptyArr = new int[8];
            fillArray(emptyArr);
            System.out.println("Массив после обработки методом для задания 2: " + Arrays.toString(emptyArr));

            System.out.println();

            //Задание 3
            int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println("Изначальный массив задания 3: " + Arrays.toString(arr3));
            multiplyArray(arr3);
            System.out.println("Массив после обработки методом для задания 3: " + Arrays.toString(arr3));

            System.out.println();

            //Задание 4
            int[] arr4 = {3,5,7,-9,8};
            System.out.println("Массив для задания 4: " + Arrays.toString(arr4));
            System.out.println("Максимальный элемент массива: " + getArrayMaxNumber(arr4));
            System.out.println("Минимальный элемент массива: " + getArrayMinNumber(arr4));

            System.out.println();

            //Задание 5
            System.out.println("Квадратный массив с единицами по диагонале для задания 5:");
            int[][] squareArr = new int[7][7];
            for (int i = 0; i < squareArr.length; i++){
                for (int j = 0; j < squareArr[0].length; j++){
                    if (i == j || (i+j) == (squareArr.length - 1))
                        squareArr[i][j] = 1;
                    System.out.print(squareArr[i][j] + "");
                }
                System.out.println();
            }
            System.out.println();


            //Задание 6
            int[] arr7 = {1,2,3,-6};
            System.out.println("Массив для задания 6:" + Arrays.toString(arr7));
            String a = (isBalanced(arr7)) ? "Да" : "Нет";
            System.out.println("Является ли данный массив \"сбалансированным\"? - " + a );
            //searchForBalance(arr7);

    }
    }
