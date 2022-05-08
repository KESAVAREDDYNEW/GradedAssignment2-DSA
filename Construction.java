package com.gl.dsa.driver;
import java.util.Scanner;
import java.util.Arrays;
public class Construction {
public static void main (String[] args) {
	
	int option;
	Scanner sc1= new Scanner(System.in);
	int numberOfFloors,  numberOfFloorSizes[];
		System.out.println (" Please enter the number floors in the building");
		numberOfFloors = sc1.nextInt();
		numberOfFloorSizes = new int[numberOfFloors];
		for (int i=0; i<numberOfFloors; i++) {
		System.out.println (" Please enter  the  floors  sizes  Given to Architect  for day   "  +(i+1));
		numberOfFloorSizes[i] = sc1.nextInt(); 
		}
		Arrays.sort(numberOfFloorSizes);
		// Printing floor size after sorting
		System.out.println ("Floor Sizes in Ascending Order");
		for ( int i=0; i<numberOfFloors; i++) {
			System.out.print( numberOfFloorSizes[i] +",   ");

			}
            System.out.println();
             option=1;

            for (int i=0; i<numberOfFloors; i++) {
            	if(option >numberOfFloors) {
            		System.out.println("Construction program completed");
            	} else
            		option=option+i;
           
            	
			System.out.println("Construction Program  As per Floor Size");
			System.out.println(" Enter  the day to know floors to construct");
			System.out.println();
			option = sc1.nextInt();
			switch(option){
				case 1:
					System.out.println (" Construction program for Day 1- Floor to be installed");
					System.out.println("  Floor Size is .....>   " + numberOfFloorSizes[numberOfFloors-option]);
					break;
				case 2:
					System.out.println (" Construction program for Day 2- Floor to be installed");
					System.out.println("  Floor Size is .....>  " + numberOfFloorSizes[numberOfFloors-option]);
					break;
				case 3:
					System.out.println (" Construction program for Day 3- Floor to be installed");
					System.out.println(" Floor Size is .....> " + numberOfFloorSizes[numberOfFloors-option]);
					break;
				case 4:
					System.out.println (" Construction program for Day 4- Floor to be installed");
					System.out.println("  Floor Size is .....>" + numberOfFloorSizes[numberOfFloors-option]);
					break;
				case 5:
					System.out.println (" Construction program for Day 5- Floor to be installed");
					System.out.println(" Floor Size is .....>" + numberOfFloorSizes[numberOfFloors-option]);
					break;
				case 6:
					System.out.println (" Construction program for Day 6- Floor to be installed");
					System.out.println("  Floor Size is .....>" + numberOfFloorSizes[numberOfFloors-option]);
					break;
				case 7:
					System.out.println (" Construction program for Day 7- Floor to be installed");
					System.out.println("  Floor Size is .....>" + numberOfFloorSizes[numberOfFloors-option]);
					break;
				case 8:
					System.out.println (" Construction program for Day 8- Floor to be installed");
					System.out.println("  Floor Size is .....>" + numberOfFloorSizes[numberOfFloors-option]);
					break;
				case 9:
					System.out.println (" Construction program for Day 9- Floor to be installed");
					System.out.println("  Floor Size is .....>" + numberOfFloorSizes[numberOfFloors-option]);
					break;
				case 10:
					System.out.println (" Construction program for Day 10- Floor to be installed");
					System.out.println(" Floor Size is .....>" + numberOfFloorSizes[numberOfFloors-option]);
					break;
				default :
					break;
			}
            }
		sc1.close();
	}
}
	
