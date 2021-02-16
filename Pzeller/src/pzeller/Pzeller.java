/*
Objetivo: GitHub

 */
package pzeller;

import java.util.Scanner;

public class Pzeller {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int year, dia=13, month=9;
        System.out.println("Year: ");
        year = keyboard.nextInt();
        String stDat = birthDay_ZellerMonlau(year, dia, month);
        dia= dias(dia, year);
        System.out.println("Autor: Sergio Vinas");
        System.out.println("International programmer's day: "+ dia + " " + stDat + " september " + year);

    }
    
    private static int dias(int dia, int year){
        int day=0;
        if (year%4==0 && (year%100!=0 || year%400==0)){
            dia=12;}
        return dia;
    }
    
    private static String birthDay_ZellerMonlau(int year, int dia, int month) {
        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;
        
        a = (14 - 9) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return ArrayWeek[d];
    }

}
