/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class stirlingsayııs {
public static int comb (int y,int z)
{
        return fak(y)/(fak(y-z)*fak(z));
    
}
    public static int fak(int x){
        int c=1;
        for(int i=1; i<=x; i++){
            c=c*i;
        }
        return c; // return döndürmek için kullanılır
    }
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("lütfen üst sınır giriniz (n)");
        int n=input.nextInt();
        System.out.println("lütfen alt sınır giriniz(k)");
        int k=input.nextInt();
        double t=0;
        for(int i=0; i<=k;i++)
        {
               t+=Math.pow((-1),i)*comb(k,i)*Math.pow((k-i),n);
        
    }
        System.out.println(t*1/fak(k));
    }
    
}
