package com.kcs.uzd.pask4.Servise;

import com.kcs.uzd.pask4.WO.Clientt;

import java.util.Set;

/**
 * Created by Egidijus on 3/2/2017.
 */
public interface ReadDataService
{
    Set<Clientt> readClientInfo(String fileName);

    void writeClientInfo(String fileName, Set<Clientt> clients);

}
