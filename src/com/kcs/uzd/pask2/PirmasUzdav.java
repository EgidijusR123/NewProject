package com.kcs.uzd.pask2;

import java.util.Scanner;

/**
 * Created by Egidijus on 2/28/2017.
 */
public class PirmasUzdav {
    private static String getText(int numb)
    {
        String text="This number is odd";
        if(numb%2==0)
        {
            text="This number is even";
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please insert number");
        int numb=sc.nextInt();
        System.out.println(getText(numb));
    }
}
