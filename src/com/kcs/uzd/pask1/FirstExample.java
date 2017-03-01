package com.kcs.uzd.pask1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Egidijus on 2/27/2017.
 */
public class FirstExample {
    public static float SkaicSum(float skaic1, float skaic2)
    {
        return skaic1+skaic2;
    }
    public static float SkaicSkirt(float skaic1, float skaic2)
    {
        return skaic1-skaic2;
    }
    public static int SkaicSum(int skaic1, int skaic2)
    {
        return skaic1+skaic2;
    }
    public static int SkaicSkirt(int skaic1, int skaic2)
    {
        return skaic1-skaic2;
    }
    public static float KMI(float svoris,float ugis)
    {
        float kmi=0.0f;
        kmi=svoris/(ugis*ugis);;
        return kmi;
    }
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static void KuroSanaudos (float kuras,float km)//pasiskaityti namie!!!!!!!!!!!!!!!
    {
        float kurass=(kuras*100)/km;
        DecimalFormat k=new DecimalFormat("##.00");
        System.out.println(k.format(kurass));
    }
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static void Ivedimas(){
        Scanner sccc=new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus km");
        float Km=Float.valueOf(sccc.nextLine());
        System.out.println("Iveskite kiek l kuro sunaudojo");
        float Kuras=Float.valueOf(sccc.nextLine());
        KuroSanaudos(Kuras,Km);
    }
    public static void  Skaiciuokle(int sk1,int sk2)
    {
        int sum=0,skirt=0,sandaug=0;
        float dalyb=0;
        sum=sk1+sk2;
        skirt=sk1-sk2;
        sandaug=sk1*sk2;
        if(sk2>0||sk2<0) {
            dalyb = (float) sk1 / sk2;
        } else dalyb=0;
      //  System.out.println("Suma {0}, skirtumas {1}, sandauga {2}, dalyba {3}",sum,skirt,sandaug,dalyb);
        System.out.println("Suma "+sum+", skirtumas "+skirt+", sandauga "+sandaug+", dalyba "+dalyb);
    }
    public static void  Skaiciuokle(float sk1,float sk2)
    {
        float dalyb=0,sum=0,skirt=0,sandaug=0;
        sum=sk1+sk2;
        skirt=sk1-sk2;
        sandaug=sk1*sk2;
        if(sk2>0||sk2<0) {
            dalyb = sk1 / sk2;
        } else dalyb=0;
        //  System.out.println("Suma {0}, skirtumas {1}, sandauga {2}, dalyba {3}",sum,skirt,sandaug,dalyb);
        System.out.println("Suma "+sum+", skirtumas "+skirt+", sandauga "+sandaug+", dalyba "+dalyb);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

      /*  System.out.println("Ivewkite zodi");
        String Zodis=sc.nextLine();
        int ZodzioIlgis=Zodis.length();
        System.out.println("Zodzio ilgis "+ZodzioIlgis);
       */
      /*  System.out.println( "Insert first number");
        float skaic1=Float.valueOf(sc.nextLine());
        System.out.println( "Insert second number");
        float skaic2=Float.valueOf(sc.nextLine());
        System.out.println("Sum >>"+(SkaicSum(skaic1,skaic2))+" difference >>"+(SkaicSkirt(skaic1,skaic2)));

        System.out.println( "Insert first number int");
        float skaic1Int=Float.valueOf(sc.nextLine());
        System.out.println( "Insert second number int");
        float skaic2Int=Float.valueOf(sc.nextLine());
        System.out.println("Sum >>"+(SkaicSum(skaic1Int ,skaic2Int))+" difference >>"+(SkaicSkirt(skaic1Int,skaic2Int)));
       */
      /*
        System.out.println("Iveskite savo svori kg");
        float Svoris=Float.valueOf(sc.nextLine());
        System.out.println("Iveskite savo ugi m");
        float Ugis=Float.valueOf(sc.nextLine());
        System.out.println("Jusu KMI >>"+Math.round(KMI(Svoris,Ugis)));
       */
       // Ivedimas();
        Skaiciuokle(5,0);

    }
}
