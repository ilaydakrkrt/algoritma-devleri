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
public class hilbersayilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("lütfen bir s sayısı giriniz");
      int s =input.nextInt();
      if ((s-1)%4==0){
      System.out.println("hilbert sayıdır");
      }
      else {
          System.out.println("hilbert sayı değildir");
      }
     
    }
    
}

