package com.kcs.uzd.pask2;

import java.util.Scanner;

/**
 * Created by Egidijus on 2/28/2017.
 */
public class SeptintasUzdav {
    public static void Skaiciavimas(int num1,int num2){
        System.out.println("Suma >> "+(num1+num2));
        System.out.println("Skirtumas >> "+(num1-num2));
        System.out.println("Sandauga >> "+(num1*num2));
    }
    public static void main(String[] args) {
        int numb3=0;
        Scanner sc = new Scanner(System.in);
        do  {
            System.out.println("Insert two numbers");
            int numb1 = sc.nextInt();
            int numb2 = sc.nextInt();
            Skaiciavimas(numb1, numb2);
            System.out.println("If you want to continue press 5");
            numb3 = sc.nextInt();
        }while(numb3==5);
    }
}
