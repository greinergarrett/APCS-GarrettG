/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_10;

/**
 *
 * @author Garrett
 */
public class valbool {
    public int value  =0;
    public boolean iseven;
    public String nstr;
    
    public void check(){
        iseven=(value%2==0);
    }
    public void makestr(int i){
        if(iseven)
            nstr=i+": "+value+" *";
        else
            nstr=i+": "+value;   
    }
    
}
