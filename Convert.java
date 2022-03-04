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
public class Convert {
    public static String waterState;
    public static int c;

    /**
     * @param arg
     */
   	public static void main(String arg[])	
	{
            double f=(9*c)/5+32;
            double r=(4*c)/5;
	    double k=c+273.15;
            
                              if (c<1) {
                  waterState = "freezing";
            }
            else if (c>99) {
                  waterState = "boiling";
            }
            else {
                  waterState = "normal";}
                  System.out.println("Water condition is " +waterState);
	   }  
