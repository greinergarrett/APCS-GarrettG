/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_13;

/**
 *
 * @author Garrett
 */
public class Ex1_13 {

    public static void main(String[] args) {
        int i        =0;
        valbool[]obj = new valbool[9];
        valbool seq1 = new valbool() ;
        valbool seq2 = new valbool() ;
        valbool seq3 = new valbool() ;
        valbool seq4 = new valbool() ;
        valbool seq5 = new valbool() ;
        valbool seq6 = new valbool() ;
        valbool seq7 = new valbool() ;
        valbool seq8 = new valbool() ;
        valbool seq9 = new valbool() ;
        obj[0]=seq1;
        obj[1]=seq2;
        obj[2]=seq3;
        obj[3]=seq4;
        obj[4]=seq5;
        obj[5]=seq6;
        obj[6]=seq7;
        obj[7]=seq8;
        obj[8]=seq9;
        
        obj[i].value=1;
        i++;
        obj[i].value=1;
        for(i++; i<obj.length; i++){
            obj[i].value=obj[i-2].value+obj[i-1].value;
            obj[i].check();
        }
        i=0;
        while(i<obj.length){
            if(obj[i].iseven)
                System.out.printf("%d: %d *%n", i+1, obj[i].value);
            else
                System.out.printf("%d: %d%n", i+1, obj[i].value);
            i++;
        }
    }
    
}
