package com.axcel.example;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] xyz = new int[] {8, 10, 1, 6};  
		for (int i=0;i<xyz.length; i++) {
			for(int j=i;j<xyz.length; j++) {
				if( xyz[i]> xyz [j]) {
					int temp = xyz [j];
					xyz [j] = xyz [i]; 
					xyz [i] = temp; 
				}
					
			}
			
	}
		for(int i=0; i< xyz.length; i++) {
			System.out.println(xyz[i]); 
			
		}
} 

//	The numbers are arranged randomly in an array. 
//	We define a variable x
//  One by one, each number (i) in the array is chosen in order 
//  If the number is smaller than x, it is moved temporarily to the other variable, while x replaces it.
//  Then, the number is returned to the place of x
//  
//int[] numbers = {8, 10, 1, 6};
//for (i= 0; i <number.len; i ++); 
//for (j=i j< number.len; j++);
//if (number (i)> number[j])
//temp= number[j]
//number [j] = number [i]
//number [i] = temp 
//int i = 0; 

	
		
	
	
	
}


