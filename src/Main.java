
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = 0; //счётчик.
        System.out.print("Введите количество строк: ");
        int rows = scan.nextInt();
        System.out.print("Введите количество элементов строки: ");
        int cols = scan.nextInt();
        int[][] arr = new int[rows][cols];
        Random rand = new Random(0);
        for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Количество строк: " + arr.length);
        System.out.println("Количество элементов строки: " + arr[0].length);
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
                sum = sum + arr[i][j];
                n++;
            }
            System.out.println();
        }
        System.out.println("Задача #1: " + "Сумма всех элементов: " + sum);

        double average = (double) sum / n;
        if (sum % n == 0){
            System.out.println("Задача #2: " + "Среднее арифметическое элементов массива: " + ((int) + average));
        } else {
            System.out.println("Задача #2: " + "Среднее арифметическое элементов массива: " + average);
        }
    }
}