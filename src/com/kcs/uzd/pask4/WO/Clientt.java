package com.kcs.uzd.pask4.WO;

import java.io.Serializable;

/**
 * Created by Egidijus on 3/2/2017.
 */
public class Clientt implements Serializable
{
    private String namee;
    private String surnamee;

    public Clientt(String namee, String surnamee)
    {
    this.namee=namee;
    this.surnamee=surnamee;
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public String getSurnamee() {
        return surnamee;
    }

    public void setSurnamee(String surnamee) {
        this.surnamee = surnamee;
    }
}
