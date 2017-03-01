package com.kcs.uzd.pask1;

import com.kcs.uzd.pask1.Bolt;

/**
 * Created by Egidijus on 2/27/2017.
 */
public class BoltExample {

    public static void main(String[] args) {

        Bolt bolt=new Bolt();

        bolt.prisukti();
       // bolt.atsukti();
     /*   BoltExample example=new BoltExample();
        example.loop(bolt);*/
     loop(bolt);
    }

    private static void loop(Bolt bolt)//statini gali issikviesti tiesiogiai
    {
     for(int i=0; i<=5;i++)
     {
         bolt.prisukti();
     }
    }
}
