package com.kcs.uzd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Egidijus on 3/2/2017.
 */
public class Uzduotis
{
    public static void main(String[] args) {
        List<String> NewList=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Insert string");
            NewList.add(sc.nextLine());
        }
        System.out.println();
        Iterator<String> iterator = NewList.iterator();
        int i=1;
        while (iterator.hasNext())
        {
            iterator.next();
            if(i%2==0){
                iterator.remove();
            }
            i++;
        }
        System.out.println(NewList.size());
    }
}
