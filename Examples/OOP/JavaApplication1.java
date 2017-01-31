/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author ashok
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        demo1(); // break, continue, nested loops
        //demo2();  // inputs, Dialogs, conditional and while statements
        //demo3();        
    }
    
    public static double convertToC(double f){
        return (5/9.0)*(f-32);
    }
    
    public static void demo1(){
        int i,j;
        System.out.println("demo of \"break\" statement");
        for(i=0;i<5;i++)
        {
            if(i==3) break;
            System.out.println("Index is "+i);
        }
    
        System.out.println("demo of \"continue\" statement");
        for(i=0;i<5;i++)
        {
            if(i==3) continue;
            System.out.println("Index is "+i);
        }
        
        System.out.println("demo of \"nested\" loops");
        for(i=1;i<5;i=i+2)
        {
            for(j=2;j<5;j+=2)
                System.out.println(i+" * "+j+" = "+i*j);
        }
    
    }
    
    public static void demo2(){
        int i;   
        System.out.println("demo of \"conditional\" statement");
           // import java.util.Scanner above
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=in.nextInt();
        if(age>35)
            System.out.println("It's party time buddy. You are "+(age-35)+" years wiser");
        else
            System.out.println("It's your world. Enjoy");
        
        System.out.println("demo of \"input\" methods");
        System.out.println("Enter your name");
        String name=in.next();
        System.out.println("Hello "+name+". Enter two decimal numbers");
        double a=in.nextDouble();
        double b=in.nextDouble();
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println("demo of \"while\" loop");
        i=0;
        while(i<5){
            System.out.println("Hello World");
            i++;
        }
        
        // JOptionPane for Dialog boxes
        // import javax.swing.JOptionPane 
        String response=JOptionPane.showInputDialog(null,"Enter Temp in deg F");
        double F=Double.parseDouble(response);
        double c=(5/9.0)*(F-32);
        // Decimal Format
        // import java.text.DecimalFormat
        DecimalFormat df=new DecimalFormat("0.00");        
        JOptionPane.showMessageDialog(null,F+" in deg F is equal to "+df.format(c)+" in deg C");
        
        System.out.println("demo of \"Procedures\" with arguments");
        c=convertToC(F);
        System.out.println("C="+c);
    
    
    }
    
    public static void demo3(){
        System.out.println("demo of \"switch\" statement");
        int month=4;
        int days;
        switch(month)
        {
            case 2: days=28;break;
            case 4: case 6: case 9: case 11:
                days=30; break;
            default:
                days=31;
        
        }
        System.out.println("No of days for "+month+" is "+days);
    
    }
    
}
