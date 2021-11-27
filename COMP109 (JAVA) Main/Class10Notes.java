package com.company;

public class Class10Notes {

    public static void main(String[] args) {
        //main method that takes user array and calls avarageArray and sumArray
        //take input array from user
        int[] array = new int[5];
        System.out.println("The sum of the array is: " + sumArray(array));
        System.out.println("The average of the array is: " + averageArray(array));
    }
    //integer method that calculates the reminder of a division without using the % operator
    public static int remainderV1(int dividend, int divisor) {
        int remainder = dividend;
        while (remainder >= divisor) {
            remainder = remainder - divisor;
        }
        return remainder;
    }
    //integer method that calculates the reminder of a division without using the % operator
    public static int remainderV2(int dividend, int divisor) {
        int result = dividend / divisor;
        int result2 = divisor * result;
        int result3 = dividend - result2;
        return result3;
    }
    //integer method in java that will calculate the sum of numbers between num1 and num2 with respect to increment value num3
    public static int sumBetween(int num1, int num2, int num3) {
        int sum = 0;
        for (int i = num1; i <= num2; i += num3) {
            sum += i;
        }
        return sum;
    }
    //integer method in java that will calculate the sum of numbers between num1 and num2 with respect to increment value num3 with a while loop
    public static int sumBetweenV2(int start, int end, int incValue) {
       int sum = 0;
        while (start < end + 1) {
           sum += start;
           start += incValue;
       }
       return sum;
    }
    //method that checks how many number have prime divisors are equal to the number itself from 1 to 1000
    public static int primeDivisors(int num) {
        int sum = 0;
        //a loop from 1 to 1000
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            //another loop i from 1 to i/2+1
            for (int j = 2; j < (i / 2) + 1; j++) {
                //j isPrime and isDivisor of i
                if (isPrime(j) && i % j == 0) {
                    sum+=j;
                }
            }
            if (sum == i) {
                count++;
            }
        }
        return count;
    }
    //method that gets array with 5 values and calculates the sum
        public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {//parametric array
            sum += array[i];
        }
        return sum;
    }
//method that gets array with 5 values and calculates the average
    public static double averageArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

}
