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
public class mukemmelsayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s,t=0;
        Scanner input = new Scanner (System.in);
        System.out.print("tamsayı:");
        s= input.nextInt();
        for(int i=1; i<s; i++)
            if(s%i==0)
                t+=i;
        if(s==t){
            System.out.println("Mükemmel sayı");
        }
        else {
            System.out.println("Mükemmel sayı değil");
        }
        
    }
    
}
