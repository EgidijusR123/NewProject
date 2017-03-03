package com.kcs.uzd;

import com.kcs.uzd.pask3.WO.Car;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Egidijus on 3/2/2017.
 */

public class ReadingFileTest
{
    private static void ReadingFile(String FilleNamee,Set<Car> carzz)
    {
        try
        {
            BufferedReader bfr=new BufferedReader(new FileReader(new File(FilleNamee)));
            String LLiine=null;
            while ((LLiine=bfr.readLine())!=null)
            {
                addzCarz(LLiine,carzz);
            }
        }
        catch (IOException e)
        {
            System.out.println("Something seriously wrong");
        }
    }
    public static void addzCarz(String Lliine,Set<Car> carzz)
    {
        String[] ItemsOfSmthg=Lliine.split("\t");
        if(ItemsOfSmthg.length==3)
        {
            carzz.add(new Car(ItemsOfSmthg[0],ItemsOfSmthg[1],ItemsOfSmthg[2]));
        }
    }
    private static void PrintingSmthg(Set<Car>carzzzz)
    {
     for(Car car : carzzzz)
     {
         System.out.println(car);
     }
    }
    public static void main(String[] args)
    {
        Set<Car> carzz=new TreeSet<>();

        ReadingFile("Personal.txt",carzz);

        PrintingSmthg(carzz);
    }
}
