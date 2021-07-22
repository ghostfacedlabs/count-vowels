package com.ghostfacedlabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some text:");
        String text = scan.nextLine().toLowerCase();
        int totalVowels = 0;
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter == 'a') {
                totalVowels++;
                countA++;
            }
            if (letter == 'e') {
                totalVowels++;
                countE++;
            }
            if (letter == 'i') {
                totalVowels++;
                countI++;
            }
            if (letter == 'o') {
                totalVowels++;
                countO++;
            }
            if (letter == 'u') {
                totalVowels++;
                countU++;
            }


        }

        System.out.println("There are " + totalVowels + " vowels in the text");
        System.out.println("A: " + countA + ", E: " + countE + ", I: " + countI + ", O: " + countO + ", U: " + countU);
    }
}
