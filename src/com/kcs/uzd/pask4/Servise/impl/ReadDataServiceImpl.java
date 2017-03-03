package com.kcs.uzd.pask4.Servise.impl;

import com.kcs.uzd.pask4.Servise.ReadDataService;
import com.kcs.uzd.pask4.WO.Clientt;

import java.io.*;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Egidijus on 3/2/2017.
 */
public class ReadDataServiceImpl implements ReadDataService
{
    @Override
    public Set<Clientt> readClientInfo(String fileName)
    {
        try
        {
            FileInputStream fInput=new FileInputStream(fileName);
            ObjectInputStream ob= new ObjectInputStream(fInput);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void writeClientInfo(String fileName, Set<Clientt> clients) {

        try {
            FileOutputStream fOutput = new FileOutputStream(fileName);
            ObjectOutputStream ob=new ObjectOutputStream(fOutput);
            for(Clientt client:clients)
            {
               ob.writeObject(client);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
