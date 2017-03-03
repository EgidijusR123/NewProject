package com.kcs.uzd;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Egidijus on 3/2/2017.
 */
public class UzduotLinkedList
{
    public static void main(String[] args) {
        LinkedList<String> linkuedList=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Insert string");
            linkuedList.add(sc.nextLine());
        }
        linkuedList.addFirst("dsh");
        linkuedList.addLast("sdgsgsd");
    }
}
