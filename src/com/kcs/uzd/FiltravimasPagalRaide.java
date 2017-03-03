package com.kcs.uzd;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Egidijus on 3/2/2017.
 */
public class FiltravimasPagalRaide
{
    public static void ReadFile(String FileName, List<String>names)
    {
        try {
            BufferedReader bf=new BufferedReader(new FileReader(new File(FileName)));
            String namezz=null;
            while ((namezz=bf.readLine())!=null)
            {
                names.add(namezz);
            }
        } catch (IOException e) {
            System.out.println("Nenuskaite");
        }

    }
    public static void main(String[] args)
    {
        List<String> naujas=new ArrayList<>();
        ReadFile("ZmonVard.txt",naujas);
        Scanner sc=new Scanner(System.in);
        System.out.println("Kokia raide rodyti");
      //  char ch=sc.next
    }
}
