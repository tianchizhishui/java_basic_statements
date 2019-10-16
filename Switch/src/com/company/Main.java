package com.company;

public class Main {

    public static void main(String[] args) {
        /*int value = 4;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }*/

        int switchValue = 6;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char letter = 'W';

        switch(letter){
            case 'A':
                System.out.println("The letter is A");
                break;

            case 'B':
                System.out.println("The letter is B");
                break;

            case 'C':
                System.out.println("The letter is C");
                break;

            case 'D':
                System.out.println("The letter is D");
                break;

            case 'E':
                System.out.println("The letter is E");
                break;

            default:
                System.out.println("The letter was not found");
                break;

        }
    }
}
