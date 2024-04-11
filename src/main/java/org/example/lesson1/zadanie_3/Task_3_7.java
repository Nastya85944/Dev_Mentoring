package org.example.lesson1.zadanie_3;

import java.util.Scanner;

public class Task_3_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Zodiac sign: Aquarius, Pisces, Aries, Taurus, " +
                "Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn");

        String s = scanner.next();
        switch (s) {
            case "Aquarius":
                System.out.println("You're born between " + "20 Jan and 18 Feb");
                break;
            case "Pisces":
                System.out.println("You're born between " + "19 Feb and 19 Mar");
                break;
            case "Aries":
                System.out.println("You're born between " + "21 Mar and 19 Apr");
                break;
            case "Taurus":
                System.out.println("You're born between " + "20 Apr and 22 May");
                break;
            case "Gemini":
                System.out.println("You're born between " + "20 Apr and 22 May");
                break;
            case "Cancer":
                System.out.println("You're born between " + "22 Jun and 22 Jul");
                break;
            case "Leo":
                System.out.println("You're born between " + "23 Jul and 22 Aug");
                break;
            case "Virgo":
                System.out.println("You're born between " + "24 Aug and 22 Sep");
                break;
            case "Libra":
                System.out.println("You're born between " + "23 Sep and 22 May");
                break;
            case "Scorpio":
                System.out.println("You're born between " + "23 Oct and21 Nov");
                break;
            case "Sagittarius":
                System.out.println("You're born between " + "22 Nov and 21 Dec");
                break;
            case "Capricorn":
                System.out.println("You're born between " + "22 Dec and 19 Jan");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
