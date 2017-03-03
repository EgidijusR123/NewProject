package com.kcs.uzd.EnumExample;

/**
 * Created by Egidijus on 3/2/2017.
 */
public class MyEnumInApp
{
    public static void main(String[] args)
    {
        Week week= Week.PIRMADIENIS;
        int daynumb=Week.PIRMADIENIS.getDay();
        printWeekDays();
        System.out.println(Week.getweekday(3));
    }
    private static void printWeekDays()
    {
        for(Week day:Week.getWeek())
        {
            System.out.println("Day >>"+day.name()+" value >>"+ day.getDay());
        }
    }
}
