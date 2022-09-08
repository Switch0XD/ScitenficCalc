/* import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");
    float num1 = sc.nextFloat();
    System.out.print("Enter Number: ");
    float num2 = sc.nextFloat();
    System.out.println(num1 + num2);
  }
}
*/
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> sum = new ArrayList<Float>();
        float [] numbers = new float[1000];
        System.out.println("Enter the numbers to add");
        System.out.println("Enter 0 to see the result");
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = sc.nextFloat();
            if (numbers[i] == 0)
                break;
        }
        Main obj = new Main();
        System.out.println(obj.sum(numbers));

    }
    float sum(float[] numbers)
    {
        float sum = 0.0f;
        for (int i = 0; i <numbers.length ; i++) {
            sum+=numbers[i];
        }
        return sum;
    }
}





