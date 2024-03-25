package com.kodilla.rps;

import java.util.Scanner;

public class GameProcessor {

    public void menu() {
        System.out.println("GRA");
        System.out.println();
        System.out.println("Kamień: 1");
        System.out.println("Papier: 2");
        System.out.println("Nożyce: 3");
        System.out.println("Nowa gra: n");
        System.out.println("Koniec gry: x ");

        System.out.println();
    }

    public Thing switchGame(char b) {

        while(b!=49 && b!=50 && b!=51) {
            System.out.println("Ta gra nie obsługuje tego klawisza.");
            b = scanerChar();
        }
        switch(b) {
            case 49:
            case 50:
            case 51:{
                return choosen1(b);
            }
            default: {
                return null;
            }
        }
    }

    public boolean overX(char over) {
        boolean m = false;
        if (over == 120) {
            System.out.println("Czy na pewno zakończyć grę? " + " T/N");
            do {
                over = scanerChar();
                if (over != 116 && over != 110) System.out.println("Wybierz T lub N");
            } while (over != 116 && over != 110);
            if (over == 110) {
                System.out.println("Nowa gra? " + " T/N");
                do {
                    over = scanerChar();
                    if (over != 116 && over != 110) System.out.println("Wybierz T lub N");
                } while (over != 116 && over != 110);
                if (over == 110) m = true;
                else m = false;
            } else m = true;
        }
        if (over == 110) {
            System.out.println("Czy chcesz zacząć nową grę? " + " T/N");
            do {
                over = scanerChar();
                if (over != 116 && over != 110) System.out.println("Wybierz T lub N");
            } while (over != 116 && over != 110);
            if (over == 110) {
                System.out.println("Czy na pewno zakończyć grę? " + " T/N");
                do {
                    over = scanerChar();
                    if (over != 116 && over != 110) System.out.println("Wybierz T lub N");
                } while (over != 116 && over != 110);
                if (over == 110) m = false;
                else m = true;
            } else m = false;
        }
        return m;
    }

    public int scanerInt() {
        Scanner scaner = new Scanner(System.in);
        int x = scaner.nextInt();
        return x;
    }

    public char scanerChar() {
        Scanner scaner = new Scanner(System.in);
        char a = scaner.next().charAt(0);
        return a;
    }

    public Thing choosen(int liczba) {
        Thing object;
        if(liczba == 1) {
            object = new Stone();
        } else if(liczba == 2) {
            object = new Paper();
        } else {
            object = new Scissors();
        }
        return object;
    }

    public Thing choosen1(char liczba) {
        Thing object;
        if(liczba == 49) {
            object = new Stone();
        } else if(liczba == 50) {
            object = new Paper();
        } else {
            object = new Scissors();
        }
        return object;
    }

    public int resultInt(char gamer1, int gamer2) {
        int gamer3 = gamer1-'0';
        if (gamer3 == gamer2) {
            System.out.println("Remis");
            return 0;
        } else if ((gamer3 == 3 && gamer2 == 2) || (gamer3 == 2 && gamer2 == 1)
                || gamer3 == 1 && gamer2 == 3) {
            System.out.println("Zwycięstwo :)");
            return 1;
        } else {
            System.out.println("Porażka :(");
            return 2;}
    }

    public void result(int wyn1, int wyn2) {
        if(wyn1 > wyn2) {
            System.out.println("Wygrywasz grę : " + wyn1 + " do " + wyn2);
        } else if (wyn1 < wyn2) {
            System.out.println("Przegrywasz grę : " + wyn1 + " do " + wyn2);
        } else {
            System.out.println("Remis: " + wyn1 + " do " + wyn2);
        }
        System.out.println();
    }
}
