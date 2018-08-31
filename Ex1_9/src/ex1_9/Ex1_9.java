/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_9;

/**
 *
 * @author Garrett
 */
public class Ex1_9 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int lo    =1;
        int hi    =1;
        int i     =0;
        int [] seq=new int [9];
        
        System.out.println("Fibonacci Sequence");
        seq[i]=lo;
        i++;
        while(hi<50){
            seq[i]=hi;
            hi=lo+hi;
            lo=hi-lo;
            i++;
        }
        i=0;
        while(i<9){
            System.out.println(seq[i]);
            i++;
        }
    }
    
}
