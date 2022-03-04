/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.conversion;

import java.util.Scanner;

/**
 *
 * @author alfaa
 */
public class Main {

    public static String waterState;
    public static int c;

    /**
     * @param arg
     */
   	public static void main(String arg[])	
	{
	    
             	    Scanner sc=new Scanner(System.in);
                    
            System.out.println("[[Water Temperature Converter]]");
            System.out.println("--------------");
            System.out.println("Data entry");
            System.out.println("--------------");
            System.out.println("Input temperature in celcius: ");
            double c=sc.nextDouble();
            conv();
	}
        
        public static void conv()
        {
            Scanner sc=new Scanner(System.in);
            
            double f=(9*c)/5+32;
            double r=(4*c)/5;
	    double k=c+273.15;
            
             System.out.println("Option");
                System.out.println("------");
                System.out.println("1. View Conversion Data");
                System.out.println("2. Edit Conversion Data");
                System.out.println("3. Exit Program");
                System.out.println("Choice : ");
                   int ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1:  
	    	  System.out.println("Temperature in Celsius = "+c);
                  System.out.println("-------------------------");
                  System.out.println("Temperature in Fahrenheit = "+f);
                  System.out.println("Temperature in Reamur = "+r);
                  System.out.println("Temperature in Kelvin = "+k);
                              if (c<1) {
                  waterState = "freezing";
            }
            else if (c>99) {
                  waterState = "boiling";
            }
            else {
                  waterState = "normal";}
                  System.out.println("Water condition is " +waterState);
                  conv();
		  break;

	    case 2:  System.out.println("Input new temperature in Celcius :");
                   	  c=(int) sc.nextDouble();
                          conv();
		  break;
            case 3:  System.out.println("Thank you for using this program!");
		  break;
	   default:  System.out.println("Please choose a valid choice!");
           conv();
	   }  
        }
    }
