package com.kcs.uzd.pask4;

import com.kcs.uzd.pask4.Servise.ReadDataService;
import com.kcs.uzd.pask4.Servise.impl.ReadDataServiceImpl;
import com.kcs.uzd.pask4.WO.Clientt;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Egidijus on 3/2/2017.
 */
public class MyMainCarService
{
    private static final String FILE_NAME="Clientt.txt";
    public static void main(String[] args)
    {
        ReadDataService readDataService=new ReadDataServiceImpl();

        Set<Clientt> clients=new HashSet<>();
        clients.add(new Clientt("Jonas","Jonaitis"));
        clients.add(new Clientt("Jonas","Jonaitis"));
        clients.add(new Clientt("Jonas","Jonaitis"));

        readDataService.writeClientInfo(FILE_NAME,clients);
    }
}
