package com.kcs.uzd.pask2;

import java.util.Scanner;

/**
 * Created by Egidijus on 2/28/2017.
 */
public class AstuntasUzdav {
    public static void main(String[] args) {
        System.out.println("Insert number:");
        Scanner sc=new Scanner(System.in);
        int numb=sc.nextInt();
        while (numb<2){
            System.out.println("Insert number bigger then 1");
            numb=sc.nextInt();
        }
        for (int i=1;i<=numb;i++){
            System.out.println(i);
        }
    }
}
