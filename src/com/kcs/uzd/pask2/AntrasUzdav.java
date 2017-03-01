package com.kcs.uzd.pask2;

import java.util.Scanner;

/**
 * Created by Egidijus on 2/28/2017.
 */
public class AntrasUzdav {
    private static final String END="pabaiga";//constantos aprasymas
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String pabig="";
        while (!pabig.equals((END)))
        {
            System.out.println("Please insert a word");
            pabig=sc.nextLine();
        }
    }
}
