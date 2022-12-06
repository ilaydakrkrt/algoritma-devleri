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
public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b=2;
        Scanner input =new Scanner (System.in);
        System.out.print("Pozitif tamsayi:");
        a=input.nextInt();
        System.out.println();
        while ( a>1)
            if (a%b==0){
                System.out.printf("%d\t",b);
                a/=b;
              }
            else b++;
    }
    
}
