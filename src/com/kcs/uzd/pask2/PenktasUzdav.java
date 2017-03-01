package com.kcs.uzd.pask2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by Egidijus on 2/28/2017.
 */
public class PenktasUzdav {
    public static void main(String[] args) {
        System.out.println("Insert 5 words");
        Scanner sc=new Scanner(System.in);
        String Words[]=new String[5];
        for (int i=0;i<5;i++)
        {
            System.out.printf("Insert %d word:",i+1);
            Words[i]=sc.nextLine();
        }
        for (int i=0;i<5;i++)
        {
            System.out.printf("Inserted %d word is %s \n",i+1,Words[i]);
        }
    }
}
