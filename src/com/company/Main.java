package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    /*0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
    Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.*/

        int [] numbers = new int[30];
        System.out.println("Array with random numbers: " + Arrays.toString(getRandomNumbers(numbers)));

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Array List with random numbers: " + getRandomNumbers(arrayList));

        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Linked List with random numbers: " + getRandomNumbers(linkedList));




    }

    public static int[] getRandomNumbers(int[]numbers){
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(2);
        }
        Arrays.sort(numbers);
        return numbers;
    }

    public static ArrayList<Integer> getRandomNumbers(ArrayList<Integer> arrayList) {

        Random randNumbers = new Random();
        for(int i = 0; i < 30; i++) {
            arrayList.add(randNumbers.nextInt(2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static LinkedList<Integer> getRandomNumbers(LinkedList<Integer> linkedList){
        Random randNumbers = new Random();
        for(int i = 0; i < 30; i++) {
            linkedList.add(randNumbers.nextInt(2));
        }
        Collections.sort(linkedList);
        return linkedList;
    }
}

