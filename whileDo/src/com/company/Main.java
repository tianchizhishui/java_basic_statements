package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(-22225));

    }
    public static int sumDigits(int number) {

        if (number <= 9) {
            return -1;
        }

        int digit = 0;
        int sum = 0;
        while(number != 0) {
            digit = number % 10;
            number = number / 10;
            sum += digit;
        }
        return sum;
    }
}


    public static boolean isPalindrome(int number) {

        if (number <= 9 && number >= (-9)) {
            return true;
        }

        if (number < (-9)) {
            int digit = 0;
            int revNum = 0;
            int newNumber = number * (-1);
            while (newNumber != 0) {
                digit = newNumber % 10;
                revNum = revNum * 10 + digit;
                newNumber = newNumber / 10;
            }
            if (number == revNum) {
                return true;
            }
            return false;
        } else {
            int digit = 0;
            int revNum = 0;
            int newNumber = number * (-1);
            while (newNumber != 0) {
                digit = newNumber % 10;
                revNum = revNum * 10 + digit;
                newNumber = newNumber / 10;
            }
            if (number == revNum) {
                return true;
            }
            return false;
        }
    }

    public static int reversedNumber(int num) {
        int revNum = 0;
        int digit = 0;
        if (num >= 0 && num <=9) {
            return num;
        }

        if (num >9) {
            while (num != 0) {
                digit = num % 10;
                revNum = revNum * 10 + digit;
                num = num /10;
            }
            return revNum;
        } else {
            return -1;
        }
    }
