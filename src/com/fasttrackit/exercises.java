package com.fasttrackit;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        ex1(scan);
//        ex2(scan);
//        ex3(scan);
//        ex4(scan);
//        ex5(scan);
//        ex6(scan);
//        ex7(scan);
//        ex8(scan);
        ex9to11(scan);
    }

    public static void ex1(Scanner scan) {

        System.out.println("Enter the range in which you want to search. Ex: 4 - 20");
        int[] range = IntStream.rangeClosed(scan.nextInt(), scan.nextInt()).toArray();
        System.out.println("Your range set is : " + Arrays.toString(range));

        boolean isFount = false;
        do {
            System.out.print("Enter the number you are searching for: ");
            int searchedNumber = scan.nextInt();
            for (int i = 0; i < range.length; i++) {
                if (range[i] == searchedNumber) {
                    isFount = true;
                    break;
                } else {
                    isFount = false;
                }
            }
            System.out.println(isFount);
        } while (isFount);
    }


    public static void ex2(Scanner scan) {

        System.out.print("========= BEER CALCULATOR =========" + "\n" + "Enter the number of guests: ");
        int guests = scan.nextInt();
        System.out.print("Enter how many beers for one guest: ");
        int beersForOneGuest = scan.nextInt();
        System.out.print("Enter the number of beers in packs : ");
        guests = guests * beersForOneGuest;
        int beersNumbersInPack = scan.nextInt();
        int packs = 1;
        int totalBeers = beersNumbersInPack * packs;

        for (int i = 0; i < guests; i++) {
            if (totalBeers % guests != 0 && totalBeers / guests < 1) {
                packs++;
                totalBeers = beersNumbersInPack * packs;
            }
        }
        int remainingBeers = totalBeers - guests;
        System.out.println("You will need: " + packs + " packs/s .     Remaining beers: " + remainingBeers);

    }

    public static void ex3(Scanner scan) {

        System.out.println("========= Colour Generator =========");
        System.out.println(" ex:  R=0,   G=0,   B=0   - for black" + "\n" + "      R=255, G=255, B=255 - white. " + "\n" + "\n");
        System.out.print("Give a value to 'R' (from 0 to 255) R: ");
        int r = scan.nextInt();
        System.out.print("Give a value to 'G' (from 0 to 255) G: ");
        int g = scan.nextInt();
        System.out.print("Give a value to 'B' (from 0 to 255) B: ");
        int b = scan.nextInt();

        if (r > 255) {
            System.out.println("ERROR...  " + "R=" + r + ", G=" + g + ", B=" + b + "\n" + "R = " + r + " > 255");
        } else if (r < 0) {
            System.out.println("ERROR...  " + "R=" + r + ", G=" + g + ", B=" + b + "\n" + "R = " + r + " < 0");
        } else if (g > 255) {
            System.out.println("ERROR...  " + "R=" + r + ", G=" + g + ", B=" + b + "\n" + "G = " + g + " > 255");
        } else if (g < 0) {
            System.out.println("ERROR...  " + "R=" + r + ", G=" + g + ", B=" + b + "\n" + "G = " + g + " < 0");
        } else if (b > 255) {
            System.out.println("ERROR...  " + "R=" + r + ", G=" + g + ", B=" + b + "\n" + "B = " + b + " > 255");
        } else if (r < 0) {
            System.out.println("ERROR...  " + "R=" + r + ", G=" + g + ", B=" + b + "\n" + "G = " + g + " < 0");
        } else {
            System.out.println("Your colour is :  R=" + r + ", G=" + g + ", B=" + b);
        }
    }

    public static void ex4(Scanner scan) {

        System.out.println("====== BIGGEST NUMBER FINDER ======");
        System.out.println("Enter a long value: ");
        long number = scan.nextLong();
        long reminder = 0;
        long largestDigit = 0;
        while (number > 0) {
            reminder = number % 10;
            if (largestDigit < reminder) {
                largestDigit = reminder;
            }
            number /= 10;
        }
        System.out.println("The largest digit is " + largestDigit);


    }


    public static void ex5(Scanner scan) {

        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.print("b = ");
        int c = scan.nextInt();
        int largest = Math.max(c, (Math.max(a, b)));
        int smallest = Math.min(c, (Math.min(a, b)));
        int diff = largest - smallest;
        System.out.println("difference between largest and smallest is: " + diff);

    }

    public static void ex6(Scanner scan) {

        System.out.println("Hello");
        System.out.println("- n for operations");
        System.out.print("- e for exit" + "\n : ");
        char firstMenu;
        do {
            System.out.println("- n for operations");
            System.out.print("- e for exit" + "\n : ");
            Boolean isTrue = true;
            firstMenu = scan.next().charAt(0);
            if (firstMenu == 'e') {
                System.out.println("Goodbye!");
            } else if (firstMenu == 'n') {
                System.out.print("      a = ");
                int first = scan.nextInt();
                System.out.print("      b = ");
                int second = scan.nextInt();
                menu();
                String operator = scan.next();
                switch (operator) {
                    case "+":
                        System.out.println("      rezultat= " + (first + second));
                        System.out.println("\n" + "======================================================" + "\n");
                        break;
                    case "-":
                        System.out.println("      rezultat= " + (first - second));
                        System.out.println("\n" + "======================================================" + "\n");
                        break;
                    case "*":
                        System.out.println("      rezultat= " + (first * second));
                        System.out.println("\n" + "======================================================" + "\n");
                        break;
                    case "/":
                        if (second == 0) {
                            System.out.println("      rezultat= 0");
                        } else {
                            int division = first / second;
                            int rest = first % second;
                            System.out.println("      rezultat= " + division + " rest: " + rest);
                            System.out.println("\n" + "======================================================" + "\n");
                        }
                        break;
                }
            } else {
                System.out.println("not a valid option. try again");
            }
        } while (firstMenu != 'e');
    }

    public static void menu() {

        System.out.println("      selecteaza semnul specific fiecarui tip de operatie: " + "\n");
        System.out.println("      '+'(adunare) ");
        System.out.println("      '-' (scadere) ");
        System.out.println("      '*'(inmutire)");
        System.out.println("      '/' (impartire)");
        System.out.println("      'e' (exit)");
    }


    public static void ex7(Scanner scan) {

        System.out.print("in ce clasa esti?: ");
        int clasa = scan.nextInt();

        if (clasa < 0 && clasa > 12) {
            System.out.println(" nu e posibil esti la scoala...");
        }
        if (clasa >= 0 && clasa <= 4) {
            System.out.println(" esti in ciclul scolar primar");
        } else if (clasa >= 4 && clasa <= 8) {
            System.out.println(" esti in ciclul scolar gimnazial");
        } else if (clasa >= 9 && clasa <= 12) {
            System.out.println(" esti in ciclul scolar liceal");
        }
    }

    public static void ex8(Scanner scan) {

        String name[] = new String[5];
        double[][] grades = new double[5][5];
        double average = 0;

        for (int i = 0; i < name.length; i++) {
            System.out.println("               Student  Name:                ");
            System.out.print("Enter name: ");
            name[i] = scan.nextLine();
            System.out.println("----------------------------------------------");
        }
        System.out.println("----------------------------------------------");
        for (int row = 0; row < grades.length; row++) {
            for (int column = 0; column < grades[row].length; column++) {
                System.out.print("Enter grades : ");
                grades[row][column] = scan.nextDouble();
            }
            System.out.println("               Student Grades                 ");
            System.out.println("----------------------------------------------");
        }

        System.out.println("----------------------" + "\n");

        for (int row = 0; row < grades.length; row++) {
            System.out.print(name[row] + "          ");
            for (int column = 0; column < grades[row].length; column++) {
                System.out.print(grades[row][column] + "           ");
            }
            System.out.println();
        }

        for (int i = 0; i < name.length; i++) {
            average = (grades[i][0] + grades[i][1] + grades[i][2] + grades[i][3] + grades[i][4]) / grades.length;
            System.out.println();
            System.out.println(name[i] + "   average :" + average);

        }
    }

    public static void ex9to11(Scanner scan) {
        int random = 0;
        int number = 0;
        Random r = new Random();
        random = r.nextInt(20);
        int counter = 0;
        System.out.print("introdu  soldu pentru  joc : ");
        int sold = scan.nextInt();
        System.out.println("SOLD: " + sold + "  --------  TAXA 10 lei PENTRU FIECARE INCERCARE");
        System.out.println("Introduceti nr de ghicit pana la val max 20: ");

        do {
            if (sold >= 10) {
                System.out.print("ghici :");
                number = scan.nextInt();
            } else {
                System.out.println(" NU MAI AI CREDIT, SOLDUL TAU ESTE: " + sold);
                break;
            }

            if (number < 0 || number > 20) {
                System.out.println("numarul introdus trebuie sa fie intre  1 si 20");
                break;
            } else if (number == random) {
                System.out.println("Bravooo ai ghiciti din " + counter + "de tenative ");
            } else {
                counter++;
                sold = sold - 10;
                if (random > number) {
                    System.out.println("mai mare...  Sold: " + sold);
                } else {
                    System.out.println("mai mic...  Sold: " + sold );
                }
            }
        } while (number != random || number != -1);
    }
}





