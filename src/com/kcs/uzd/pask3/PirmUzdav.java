package com.kcs.uzd.pask3;

import com.kcs.uzd.utils.MyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Egidijus on 3/1/2017.
 */
public class PirmUzdav {
    public static void main(String[] args)
    {

        List<String> names=new ArrayList<String>();
        readFile("Persons.txt",names);
        Collections.sort(names);//sorting A to Z
        MyUtils.printList(names);
        writeFile(names,"Persons.txt");
    }

    private static void  writeFile(List<String>names,String fileName)
    {
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(new File(fileName),true));//true raso ne ant virsaus, o papildo
            for(String name:names)
            {
                bw.write(name);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Can't write to file >> "+fileName);
        }
    }
    private static void readFile(String filename,List<String>names) {
        File file = new File(filename);//sukureme faila
        try {
            FileReader reader = new FileReader(file); //sukureme reader, jam padaveme faila
            //BufferedReader bf=new BufferedReader(new FileReader(new File(filename)));
            BufferedReader bf = new BufferedReader(reader); //sukureme bufferreader ir jam padaveme reader
            String name = null;
            try {
                while ((name = bf.readLine()) != null) {//sudedame i list viska
                    names.add(name);
                }
            } catch (IOException e) {
                System.out.println("Can't read line" + e);
            } finally {
                try {
                    bf.close();
                } catch (IOException e) {
                    System.out.println("Can't close reader" + e);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find fie >>" + filename);
        }
    }
}
