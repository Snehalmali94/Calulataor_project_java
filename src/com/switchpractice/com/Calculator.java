package com.switchpractice.com;

import java.util.Scanner;

public class Calculator 
{
	Scanner s = new Scanner(System.in);
	
    
    
     public void get(char operator)
     {
    	 System.out.println("Please enter num one");
    	 int num_one = s.nextInt();
    	 
    	 System.out.println("Please enter num two");
    	 int  num_two  =s.nextInt();
    	 
    	 System.out.println("Please enter operator: +,-,*,/");
    	 char oper = s.next().charAt(0);
    	 
    
     switch(oper)
     {
             case('+'):
              int sum = num_one + num_two;
	          System.out.println("sum:" + sum);
	          break;
             case('-'):
              int subtract = num_one - num_two;
              System.out.println("subtraction:" + subtract);
              break;
             case('*'):
              int multi = num_one * num_two;
             System.out.println("muliplication:" + multi);
             break;
             case('/'):
              int devide = num_one / num_two;
             System.out.println("Devide:" + devide);
              break;
             default:
            	 System.out.println("Please enter correct operator.");
              
	         
            	 
		         
		          
           
            	  
            	 
     }
     
     
     }	 
     
}
