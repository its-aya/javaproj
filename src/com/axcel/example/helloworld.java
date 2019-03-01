package com.axcel.example;

public class helloworld {

	public static void main(String[] args) {
		float v = 4;
		int w = 2;
		int x = 5;
		int y = 3;
		int z = 1;
		float result = x+y;
		
		System.out.println("x + y =" + result);
		
		result = v/z;
		
        System.out.println("v / z =" + result);
		
		result = v*w;
		
        System.out.println("v * w =" + result);
        
        result = v-z;
		
        System.out.println("v - z =" + result);
        
        if(v == z)
		{
			System.out.println("yes");
		}
		else
		{
			 System.out.println("no");
		}
		
        if(w != y)
		{
			System.out.println("yes");
		}
		else
		{
			 System.out.println("no");
		}
        
        if(x > z)
		{
			System.out.println("it is");
		}
		else
		{
			 System.out.println("it is not");
		}
        
        
        
	}
}

