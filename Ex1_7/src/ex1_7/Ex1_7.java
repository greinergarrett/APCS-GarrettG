/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_7;

/**
 *
 * @author Garrett
 */
public class Ex1_7 {

    static final int MAX_INDEX =9;
    public static void main(String[] args) {
        int lo=1;
        int hi=1;
        
        String mark;
        
        System.out.println("9: "+lo);
        for(int i=MAX_INDEX-1; i>0; i--){
            if(hi%2==0)
                mark=" *";
            else
                mark="";
            System.out.println(i+": "+hi+mark);
            hi=lo+hi;
            lo=hi-lo;
        }
    }
    
}
