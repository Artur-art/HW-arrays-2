import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static int[] array = generateRandomArray();
    public static void main (String[] args){
        System.out.println("Задача 1");
        int summOfSpending = 0;
        for (int i = 0; i < array.length; i++) {
            summOfSpending = summOfSpending + array[i];


        }
        System.out.println("Сумма трат за месяц составила " + summOfSpending + " рублей");
        System.out.println("Задача №2");
        int maxSpending = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxSpending){
                final int current = array[i];
                if (current > maxSpending){
                    maxSpending = current;
                }
            }

        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + "рублей");
        int minSpending = 200000;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minSpending){
                final int current = array[i];
                if (current < minSpending){
                    minSpending = current;
                }
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей.");
        System.out.println("Задача №3");
        int averageSpending = summOfSpending;
        for (int i = 0; i < array.length; i++) {
            averageSpending = summOfSpending / array.length;

        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей");
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);

        }
        System.out.println("OH MY GOOOOODDDD");


        }





        }









