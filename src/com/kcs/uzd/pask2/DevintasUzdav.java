package com.kcs.uzd.pask2;

import java.util.Scanner;

/**
 * Created by Egidijus on 2/28/2017.
 */
public class DevintasUzdav {
    public static void  Sumer(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum >> "+sum);
    }
    public static void  Multiplyer(int num){
        int mult=1;
        for(int i=1;i<=num;i++){
            mult*=i;
        }
        System.out.println("mult >> "+mult);
    }
    public static void main(String[] args) {
        System.out.println("Insert number:");
        Scanner sc=new Scanner(System.in);
        int numb=sc.nextInt();
        while(numb<2){
            System.out.println("Insert number bigger then 1");
            numb=sc.nextInt();
        }
        System.out.println("Insert what you want:1 if sum; 2 if multiply");
        int numb2=sc.nextInt();
        if(numb2==1){
            Sumer(numb);
        } else  if(numb2==2){
            Multiplyer(numb);
        }
    }
}
