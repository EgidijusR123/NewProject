package com.kcs.uzd.pask2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Egidijus on 2/28/2017.
 */
public class TreciasUzdav {
    public static void main(String[] args) {
        int numb=1;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        while (numb!=0){
            System.out.println("Insert number");
            try {
                numb=sc.nextInt();
                sum+=numb;
            } catch (InputMismatchException e){
                System.out.println("Blogai");
                sc.nextLine();
            }
        }
        System.out.println("Sum >> "+sum);
    }
}
