package com.kcs.uzd;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Egidijus on 3/2/2017.
 */
public class UzduotLinkedListSplit
{
    public static void main(String[] args) {
        LinkedList<String> linkeudList=new LinkedList();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            linkeudList.add(sc.nextLine());
        }
        int a=linkeudList.size();
        List sub=linkeudList.subList(0,a/2);
        List sub2=linkeudList.subList(a/2,a);

        System.out.println(sub);
        System.out.println(sub2);

    }
}
