/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_8;


class Point{
    public double x,y;
    public void change(Point that){
        this.x = that.x;
        this.y = that.y;
    }  
}

public class Ex1_8 {
    public static void main(String[] args) {
        
        Point first  = new Point();
        Point second = new Point();
        first.x      =11;
        first.y      =4;
        second.x     =3;
        second.y     =8;
        System.out.println("Point1 x="+first.x );
        System.out.println("Point1 y="+first.y );
        System.out.println("Point2 x="+second.x);
        System.out.println("Point2 y="+second.y);
        second.change(first);
        System.out.println("After change"      );
        System.out.println("Point2 x="+second.x);
        System.out.println("Point2 y="+second.y);
        
    }
}
