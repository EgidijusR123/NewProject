package com.kcs.uzd.pask2;

import java.util.Scanner;

/**
 * Created by Egidijus on 2/28/2017.
 */


public class DesimtasUzdav {
    public static int DidzMasNar(int []mas)
    {
        int length=mas.length;
        int max=mas[0];
        for(int i=1;i<length;i++)
        {
            if (mas[i] > max) {
              max = mas[i];
            }
        }
        return max;
    }
    public static int MazMasNar(int []mas)
    {
        int length=mas.length;
        int min=mas[0];
        for(int i=1;i<length;i++)
        {
            if(mas[i]<min)
            {
                min=mas[i];
            }
        }
        return min;
    }
    public static int[] Suktuk(int[]mas)
    {
        int length=mas.length;
        int[]Rmas=new int[length];
        int length1=length-1;
        for (int i=0;i<length;i++)
        {
            Rmas[length1]=mas[i];
            length1--;
        }
        for (int i=0;i<length;i++){
            System.out.println("Apversras "+Rmas[i]);
        }
        return mas;
    }
    public static void main(String[] args)
    {
        System.out.println("Insert how long will array be:");
        Scanner sc=new Scanner(System.in);
        int howLong=sc.nextInt();
        int[]mas=new int[howLong];
        for(int i=0;i<howLong;i++)
        {
            System.out.println("Insert number to array");
            mas[i]=sc.nextInt();
        }
        System.out.println(DidzMasNar(mas));
        System.out.println(MazMasNar(mas));
        Suktuk(mas);
    }
}
