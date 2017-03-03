package com.kcs.uzd.EnumExample;

import java.util.EnumSet;

/**
 * Created by Egidijus on 3/2/2017.
 */
public enum Week {
    PIRMADIENIS(1),ANTRADIENIS(2),TRECIADIENIS(3),KETVIRTADIENIS(4),PENKTADIENIS(5),SESTADIENIS(6),SEKAMDIENIS(7),NEZINAU(0);
    private int day;
    Week(int day){
        this.day=day;
    }
    public int getDay(){
        return day;
    }
    public static EnumSet<Week> getWeek(){
        return EnumSet.allOf(Week.class);
    }
    public static Week getweekday(int number)
    {
        Week week=NEZINAU;
        for(Week day:Week.getWeek())
        {
            if(day.getDay()==number)
            {
                week = day;
            }
        }
        return week;
    }
}
