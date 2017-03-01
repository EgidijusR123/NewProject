package com.kcs.uzd.pask2;

import java.util.Scanner;

/**
 * Created by Egidijus on 2/28/2017.
 */

public class SestasUzdav {
    public static void MasyvPerdav(int[]mas)
    {
        int howMany=mas.length;
        for(int i=0;i<howMany;i++){
            if(mas[i]>100){
                System.out.println(mas[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Insert how many numbers you want:");
        Scanner sc=new Scanner(System.in);
        int howMany=sc.nextInt();
        int[] masyv=new int[howMany];
        for(int i=0;i<howMany;i++){
            System.out.print("Insert number:");
            masyv[i]=sc.nextInt();
        }
        MasyvPerdav(masyv);
    }
}
