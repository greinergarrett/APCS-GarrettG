/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_10;

public class Ex1_10 {

    static final int MAX_INDEX =9;
    public static void main(String[] args) {
        int lo       =1;
        int hi       =1;
        int n        =0;
        int p        =0;
        valbool[] obj=new valbool [9];
        
        valbool seq1= new valbool();
        valbool seq2= new valbool();
        valbool seq3= new valbool();
        valbool seq4= new valbool();
        valbool seq5= new valbool();
        valbool seq6= new valbool();
        valbool seq7= new valbool();
        valbool seq8= new valbool();
        valbool seq9= new valbool();
        seq1.value  =lo;
        obj[0]=seq1;
        obj[1]=seq2;
        obj[2]=seq3;
        obj[3]=seq4;
        obj[4]=seq5;
        obj[5]=seq6;
        obj[6]=seq7;
        obj[7]=seq8;
        obj[8]=seq9;
        
        for(int i=1; i<MAX_INDEX; i++){
            obj[i].value=hi;
            if(hi%2==0){
                obj[i].is_even=1;
            }
            hi=lo+hi;
            lo=hi-lo;
        }
        while(n<9){
            p=n+1;
            if(obj[n].is_even==1){
                System.out.println(p+": "+obj[n].value+" *");
            }
            else{
                System.out.println(p+": "+obj[n].value);
            }
            n++;
        }
    }
    
}
