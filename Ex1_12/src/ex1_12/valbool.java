/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_12;

/**
 *
 * @author Garrett
 */
public class valbool {
    public int value  =0;
    public boolean iseven;
    
    public void check(){
        iseven=(value%2==0);
    }
    public String makestr(int i){
        String nstr;
        if(iseven)
            nstr=i+": "+value+" *";
        else
            nstr=i+": "+value;
        return nstr;
    }
}
