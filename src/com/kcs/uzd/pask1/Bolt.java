package com.kcs.uzd.pask1;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Egidijus on 2/27/2017.
 */
public class Bolt {
    private int sriegis=0;


    private boolean isSafe(){
        boolean response=true;
        if(sriegis>=5 )
        {
            response=false;
        }
        return response;
    }

    public void prisukti()
    {
        boolean val=isSafe();
        if(val)
        {
            sriegis++;
        } else
            {
                System.out.println("Jau gana!!!");
            }
    }

    public void atsukti() {
        if (sriegis > 0)
        {
            sriegis--;
        } else
            {
              System.out.println("Neisuktas");
            }
    }
}
