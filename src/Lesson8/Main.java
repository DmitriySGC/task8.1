package Lesson8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        String str = in.nextLine();
        System.out.println("Введите число: ");
        int n2 = in.nextInt();
        Integer n1 = new Integer (str);
        if (n1 >= n2) {
            double n3 = n2;
            System.out.println(n1);
            System.out.println(n3);
        }
        else {
                double n3 =  n1;
                System.out.println(n2);
                System.out.println(n3);
            }
    }
}
