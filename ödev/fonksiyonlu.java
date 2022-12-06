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
public class fonksiyonlu {

  public static int comb (int y,int z){
     return fak(y)/(fak(y-z)*fak(z));
  }
    public static int fak(int x){
        int c=1;
        for(int i=1; i<=x; i++){
            c=c*i;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(comb(5,2));
    }
    
}
