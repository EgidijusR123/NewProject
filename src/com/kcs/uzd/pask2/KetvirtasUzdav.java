package com.kcs.uzd.pask2;

import java.util.Scanner;

/**
 * Created by Egidijus on 2/28/2017.
 */
public class KetvirtasUzdav {
    public static void main(String[] args) {
        int[]masyv=new int[5];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.printf("Insert number %d %d\n",(i+1),(i+5));
            masyv[i]=sc.nextInt();
            sum+=masyv[i];
        }
        for(int i=0;i<5;i++){
            System.out.println(masyv[i]);
        }
        System.out.println(sum);
    }
}
