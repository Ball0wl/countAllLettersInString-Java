package com.company;
import java.util.Scanner;

public class countLetters {

    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public int[] countLetter(String s) {
        s = s.toLowerCase();
        int[] anzahl = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char aktChar = s.charAt(i);
            int arrayPos = alphabet.indexOf(aktChar);
            anzahl[arrayPos]++;
        }
        return anzahl;
    }

    public static void main(String[] args) {
        Blatt15_Aufgabe02Part2 test = new Blatt15_Aufgabe02Part2();
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein: ");
        String s = input.nextLine().replace(" ", "");

        int[] result = test.countLetter(s);
        for (int i = 0; i < result.length; i++) {
            System.out.println(test.alphabet.charAt(i) + " = " + result[i]);
        }
    }
}