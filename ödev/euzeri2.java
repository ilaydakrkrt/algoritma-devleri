/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author USER
 */import java.util.Scanner;
public class euzeri2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x,n,sonuc;
        Scanner input=new Scanner (System.in);
        System.out.printf("exp(x)=lim(1+x/n)^n\n\n");
        System.out.print("x:");
        x=input.nextDouble();
        System.out.print("n:");
        n=input.nextDouble();
        sonuc=Math.pow((1+x/n), n);
        System.out.printf("\nexp(%f)=%f\n",x,sonuc);
    }
    
}
